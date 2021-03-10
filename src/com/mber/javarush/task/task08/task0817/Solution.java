package com.mber.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();
        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Сильвестр");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Ярослав");
        map.put("Новиков", "Сильвестр");
        map.put("Козлов", "Михаил");
        map.put("Морозов", "Алексей");
        map.put("Петров", "Алексей");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (String name : copy.values()) {
            int count = 0;
            for (String nameTmp : map.values()) {
                if (nameTmp.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
        System.out.println(map);
    }

    public static void removeTheFirstNameDuplicates2(Map<String, String> map) {
        Map<String, String> copy1 = new HashMap<>(map);
        Map<String, String> copy2 = new HashMap<>(map);
        for (String key : copy1.keySet()) {
            copy2.remove(key);
            if(copy2.containsValue(copy1.get(key))){
                removeItemFromMapByValue(map, copy1.get(key));
            }
        }
        System.out.println(map);
    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) throws Exception{
        System.out.println(createMap());
        removeTheFirstNameDuplicates(createMap());
    }
}