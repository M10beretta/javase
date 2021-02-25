package com.mber.dmdev.level2.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacingSubstrings {
    public static void main(String[] args) {
        String phoneNumber = "gsdh+375 (29) 898-12-13 hdhhfdh +375 (44) 898-12-13" +
                "f34t2g434 aaj thrtj ykt543777 +375 (25) 342-12-33 ahh jajaj" +
                "+375 (33) 125-63-33gsdgg437734sdhah 54hgfh =09 " +
                "dsggeg3344y3hsags 6u56j5";

        String regex = "(\\d{3})-(\\d{2})-(\\d{2})";
/*
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        StringBuilder stringBuilder = new StringBuilder();

        while (matcheStringBuilderr.find()) {
            String gr1 = matcher.group(2);
            String gr2 = matcher.group(3);
            String gr3 = matcher.group(4);

            matcher.appendReplacement(stringBuilder, gr1 + " " + gr2+ " " + gr3);
            matcher.appendReplacement(stringBuilder, "$2 $3 $4");
        }
        matcher.appendTail(stringBuilder);
        System.out.println(stringBuilder);
*/


        System.out.println(phoneNumber.replaceAll(regex, "$1 - $2 - $3 "));
    }







    private static void extracted1() {
        String phoneNumber = "gsdh+375 (29) 898-12-13 hdhhfdh +375 (44) 898-12-13" +
                "f34t2g434 aaj thrtj ykt543777 +375 (25) 342-12-33 ahh jajaj" +
                "+375 (33) 125-63-33gsdgg437734sdhah 54hgfh =09 " +
                "dsggeg3344y3hsags 6u56j5";

        String regex = "(\\+375)? \\((29|33|44|25)\\) \\d{3}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()){
            matcher.appendReplacement(stringBuilder, "XXX");
        }
        matcher.appendTail(stringBuilder);
        System.out.println(stringBuilder);
    }
}
