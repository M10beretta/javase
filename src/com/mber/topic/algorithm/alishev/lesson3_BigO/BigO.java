package com.mber.topic.algorithm.alishev.lesson3_BigO;

import java.util.stream.LongStream;

public class BigO {
    public static void main(String[] args) {

        calculateAndPrintBigO(12);
        calculateAndPrintBigO(20);
    }

    private static void calculateAndPrintBigO(int n) {
        System.out.printf("""
                        O(1):         %d
                        O(log n):     %.1f
                        O(sqrt(n))    %.1f
                        O(n):         %d
                        O(n log n):   %.0f
                        O(n^2):       %.0f
                        O(2^n):       %.0f
                        O(n!):        %d
                                                
                        """,
                1,
                Math.log(n),
                Math.sqrt(n),
                n,
                n * Math.log(n),
                Math.pow(n, 2),
                Math.pow(2, n),
                LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y)
        );
    }
}

/*
O(1):         1
O(log n):     2,5
O(sqrt(n))    3,5
O(n):         12
O(n log n):   30
O(n^2):       144
O(2^n):       4096
O(n!):        479001600

O(1):         1
O(log n):     3,0
O(sqrt(n))    4,5
O(n):         20
O(n log n):   60
O(n^2):       400
O(2^n):       1048576
O(n!):        2432902008176640000
*/