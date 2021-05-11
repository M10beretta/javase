package com.mber.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        {
            args[0] = "-u";
            args[1] = "198478";
            args[2] = "Майка супермен";
            args[3] = "100.87";
            args[4] = "50";
            String keyboardData = "D:\\Study\\programming\\practice\\src\\com.mber.javarush\\counter\\task1828\\file1.txt.txt.txt";
            System.setIn(new ByteArrayInputStream(keyboardData.getBytes()));
        }

//        {
//            args[0] = "-d";
//            args[1] = "19846";
//            args[2] = " ";
//            args[3] = " ";
//            args[4] = " ";
//            String keyboardData = "D:\\Study\\programming\\practice\\src\\com.mber.javarush\\counter\\task1828\\file1.txt.txt.txt";
//            System.setIn(new ByteArrayInputStream(keyboardData.getBytes()));
//        }


        if (args.length == 0 || !args[0].equals("-u") && !args[0].equals("-d")) return;

        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        List<String> list = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                String string = fileReader.readLine();
                String substring = string.substring(0, 8).trim();
                if (args[1].equals(substring)) {
                    if (args[0].equals("-u")) {
                        string = String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]);
                    } else if (args[0].equals("-d")) continue;
                }
                list.add(string);
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String s : list) {
                writer.write(s+"\n");
            }
        }
    }
}

