package com.mber.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            reader.close();
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));

            String line;
            while ((line = reader1.readLine()) != null) {
                allLines.add(line);
            }

            while ((line = reader2.readLine()) != null) {
                forRemoveLines.add(line);

            }
            reader1.close();
            reader2.close();
            allLines.forEach(System.out::println);
            System.out.println();
            new Solution().joinData();
        } catch (Exception ignore) {
        }

        forRemoveLines.forEach(System.out::println);
        System.out.println();
        allLines.forEach(System.out::println);

    }

    public void joinData() throws CorruptedDataException {
        boolean chek = true;
        for (String forRemoveLine : forRemoveLines) {
            if (!allLines.contains(forRemoveLine)) {
                chek = false;
                break;
            }
        }

        if (chek) {
            allLines.removeAll(forRemoveLines);
        }

        if (!chek) {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }

}