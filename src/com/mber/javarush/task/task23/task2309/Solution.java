package com.mber.javarush.task.task23.task2309;

/* todo
Анонимность иногда так приятна!
*/

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        print(solution.getUsers());
//        print(solution.getLocations());
    }

    public static void print(List list) {
        String format = "Id=%d, name='%s', description=%s";
        for (Object obj : list) {
            NamedItem item = (NamedItem) obj;
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }
}

