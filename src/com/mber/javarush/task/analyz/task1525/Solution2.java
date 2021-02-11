package com.mber.javarush.task.analyz.task1525;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
Файл в статическом блоке
*/

public class Solution2 {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String text;
            while (!(text = bufferedReader.readLine()).isEmpty()){ // не работает с пустыми строками
                Solution2.lines.add(text);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String c : lines){
            System.out.println(c);
        }
    }


    public static void main(String[] args) {
    }
}








