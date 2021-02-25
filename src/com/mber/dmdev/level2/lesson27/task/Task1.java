package com.mber.dmdev.level2.lesson27.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 1. Написать программу, проверяющую, является ли введённая
 * строка адресом почтового ящика.
 * В названии почтового ящика разрешить использование только
 * букв, цифр и нижних подчёркиваний, при этом оно должно
 * начинаться с буквы.
 * Возможные домены верхнего уровня: .org .com
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> list = List.of("1fsg123_.org", "fsg123_.com" ,"123fsg_.org", "fsg123_.com", "f.com", "fsg123_.ru");


        for (String mail : list) {
            System.out.printf("%s : %b\n" , mail, isMail(mail));
        }
    }

    public static boolean isMail (String mail){
       return Pattern.matches("^(\\D\\w*).(com|org)$", mail);
    }
}
