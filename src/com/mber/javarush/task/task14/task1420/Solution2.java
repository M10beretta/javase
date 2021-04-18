package com.mber.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());

        if (!(first > 0 && second > 0)) {
            throw new RuntimeException();
        }

        System.out.println(maxDivSearch(first, second));
    }

    static int maxDivSearch(int firstNum, int secondNum) {
        int more = Math.max(firstNum, secondNum);
        int max = 1;
        for (int i = more; i > 0; i--) {
            if ((firstNum % i) == 0 && (secondNum % i) == 0) {
                max = i;
                break;
            }
        }
        return max;
    }
}