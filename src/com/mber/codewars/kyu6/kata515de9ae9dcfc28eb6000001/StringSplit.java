package com.mber.codewars.kyu6.kata515de9ae9dcfc28eb6000001;

/*
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the
missing second character of the final pair with an underscore ('_').
Examples:
StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
*/

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(StringSplit.solution2("abc")));
        System.out.println(Arrays.toString(StringSplit.solution2("abcdef")));
    }

    public static String[] solution2(String s) {
        s = (s.length() % 2 == 0) ? s : s + "_";
        return s.split("(?<=\\G.{2})");
    }

    public static String[] solution1(String s) {
        char[] chars = s.toCharArray();
        if (chars.length % 2 != 0) {
            char[] temp = new char[chars.length + 1];
            System.arraycopy(chars, 0, temp, 0, chars.length);
            temp[chars.length] = '_';
            chars = temp;
        }
        String[] strings = new String[(chars.length + 1) / 2];
        for (int i = 0; i < strings.length; i++) {
            int k = i * 2;
            strings[i] = chars[k] + String.valueOf(chars[k + 1]);
        }
        return strings;
    }
}

/*
Regular expression here is interpreted as follows:

(?<= is a Positive lookbehind.
It matches a group before the main expression without including it in the result.

\G
Previous match end.
Matches the end position of the previous match.

. Dot
Matches any character except line breaks.

{2} is a Quantifier.
Matches 2 of the preceding token.
 */