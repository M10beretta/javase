package com.mber.topic.regex.alishev.regex_Pattern_and_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String text = """
                Hello, Guys! I send you my email joe@gmail.com so we can
                keep in touch. Thanks, Joe! That's cool. I am sending you
                my address: tim@yandex.ru. Let's stay in touch...""";

        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(ru|com)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) System.out.println(matcher.group(1));


    }
}
