package com.mber.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        Map<String, String> paramsMap = new LinkedHashMap<>();
        paramsMap.put("name", "Ivanov");
        paramsMap.put("country", "Ukraine");
        paramsMap.put("city", "Kiev");
        paramsMap.put("age", null);
        System.out.println(getQuery(paramsMap));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder queryBuilder = new StringBuilder();
        for (String s : params.keySet()) {
            String value = params.get(s);
            if (value == null) continue;
            if (queryBuilder.toString().length() != 0) queryBuilder.append(" and ");
            queryBuilder.append(s + " = '" + value + "'");
        }
        return queryBuilder.toString();
    }
}


