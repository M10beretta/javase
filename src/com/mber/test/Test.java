package com.mber.test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        extracted2();
    }

    private static void extracted2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        var builder = new StringBuilder();
        while (true) {
            String string = reader.readLine();
            if (string.isEmpty()) break;
            builder.append(string).append("\n");
        }
        System.out.println(builder);
    }

    private static void extracted1() {
        int[] ints = {4, 2, 3, 4, 7, 43, 3, 6, 7, 324, 737, 8, 58, 3458};
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }

        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}




