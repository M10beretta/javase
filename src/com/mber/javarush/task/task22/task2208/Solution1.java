package com.mber.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/*
Формируем WHERE
*/

public class Solution1 {
    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);
        System.out.println(getQuery(params));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() == null) continue;
            builder.append(String.format("%s = '%s' and ", entry.getKey(), entry.getValue()));
        }
        builder.delete(builder.length() - 4, builder.length());
        return builder.toString().trim();
    }
}