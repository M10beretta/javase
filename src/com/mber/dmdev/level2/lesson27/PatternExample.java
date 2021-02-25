package com.mber.dmdev.level2.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {

    }

    private static void extracted3() {
        String phoneNumber = "+375 (29) 898-12-13";
        String regex = "(\\+375)? ?\\((29|33|44|25)\\) ?\\d{3}-\\d{2}-\\d{2}";
        System.out.println(Pattern.matches(regex, phoneNumber));
        System.out.println(phoneNumber.matches(regex));
    }

    private static void extracted2() {
        String phoneNumber = "+375 (29) 898-12-13";
        Pattern pattern = Pattern.compile("(\\+375)? ?\\((29|33|44|25)\\) ?\\d{3}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.matches());
    }

    private static void extracted1() {
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher("123");
        System.out.println(matcher.matches());
    }
}
