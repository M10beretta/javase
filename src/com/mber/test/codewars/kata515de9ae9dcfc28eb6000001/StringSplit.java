package com.mber.test.codewars.kata515de9ae9dcfc28eb6000001;

/*
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the
missing second character of the final pair with an underscore ('_').
Examples:
StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
 */

public class StringSplit {
    public static void main(String[] args) {
        StringSplit.solution("abc"); // should return {"ab", "c_"}
        StringSplit.solution("abcdef"); // should return {"ab", "cd", "ef"}

        String s = "abcfhfhd";


        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

        }

        /*делить на подстроки по 2 символа субстрингом, добавлять в массив,
        * заменить последнюю на нижний слеш если он не четный*/



    }



    public static String[] solution(String s) {



        return null;
    }
}
