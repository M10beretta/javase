package com.mber.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrays = new int[5];
        for (int i = 0; i < 5; i++) {
            arrays[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arrays);
        for (int i : arrays) {
            System.out.println(i);
        }
    }
}