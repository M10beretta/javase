package com.mber.topic.core.dmdev.level2.lesson27_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {
    public static void main(String[] args) {

        String regex = "(?:\\+375)? ?\\((?<code>29|33|44|25)\\) ?\\d{3}-\\d{2}-\\1";
        extractedGroup(regex);
    }

    static String phoneNumber = "gsdh+375 (29) 898-12-13 hdhhfdh +375 (44) 898-12-13" +
            "f34t2g434 aaj thrtj ykt543777 +375 (25) 342-12-33 ahh jajaj" +
            "+375 (33) 125-63-33gsdgg437734sdhah 54hgfh =09 " +
            "dsggeg3344y3hsags 6u56j5";

    private static void extractedGroup(String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void extractedGroup(String regex, int groupNum) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        while (matcher.find()) {
            System.out.println(matcher.group(groupNum));
        }
    }

    private static void extractedGroup(String regex, String groupName) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        while (matcher.find()) {
            System.out.println(matcher.group(groupName));
        }
    }
}
