package com.mber.javarush.task.task10.task1012;

/*
Количество букв

Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра.
Результат выведи на экран в алфавитном порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        //ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        //подсчет количества букв
        int[] count = new int[alphabet.size()];
        for (String line : list) {
            for (char character : line.toCharArray()) {
                int index = alphabet.indexOf(character);
                if (index < 0) {
                    continue;
                }

                count[index]++;
            }
        }

        //вывод результата
        for (int i = 0; i < alphabet.size(); i++) {
            char character = alphabet.get(i);
            System.out.println(character + " " + count[i]);
        }
    }
}