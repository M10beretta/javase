package com.mber.codewars.kata514b92a657cdc65150000006;

/*
https://www.codewars.com/kata/514b92a657cdc65150000006
6 kyu
Multiples of 3 or 5

If we list all the natural numbers below 10 that are multiples
of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples
of 3 or 5 below the number passed in.

Note: If the number is a multiple of both 3 and 5, only count it once.
Also, if a number is negative, return 0(for languages that do have them)
 */

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(new Solution().solution(10));   // 4999800      998600      19000300    + кэшируемость
        System.out.println(new Solution().solution2(10));  // 12001000     21002000    37002500
        System.out.println(Duration.between(instant,Instant.now()).getNano());
    }

    public int solution(int number) {
        int sum = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        return sum;
    }

    public int solution2(int number) {
        return IntStream.range(3, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}

