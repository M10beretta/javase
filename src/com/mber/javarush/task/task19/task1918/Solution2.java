package com.mber.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Знакомство с тегами
*/

public class Solution2 {
    public static void main(String[] args) {

        String fileName = "src/com/mber/javarush/task/task19/task1918/file.txt";
        args = new String[]{"span"};

        StringBuilder readFileContent = new StringBuilder();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                readFileContent.append(fileReader.readLine());
            }
        } catch (IOException ignore) {
            /*NOP*/
        }

        String data = readFileContent.toString().replaceAll("\r\n", "");
        TreeMap<Integer,String> map = new TreeMap<>();
        Stack<Integer> stack = new Stack<>(); // для временного хранения начального индекса найденного выражения
        String tag = args[0];

        Matcher m = Pattern.compile("</?"+tag+".*?>").matcher(data); // компилируем шаблон
        while (m.find()){
            if (m.group().matches("<"+tag+".*?")) stack.push(m.start());
            if (m.group().matches("</"+tag+">")) {
                int begin = stack.pop(); // забираем индекс начала
                map.put(begin,data.substring(begin,m.end())); // передаем индекс начала (ключ) и подстроку
            }
        }
        for (String value : map.values()) System.out.println(value);
    }
}



