package com.mber.topic.beginner.dmdev.level1.lesson6_while_for_recursion;

/**
 * 3. В 1626 году индейцы продали Манхэттен за 24$.
 * написать программу, которая высчитывает сумму,
 * получившуюся бы в текущем году, если бы индейцы положили эти
 * деньги в банк под 5% годовых.
 */
public class Task3 {
    public static void main(String[] args) {
        double sourceSum = 24;
        double result = sum(sourceSum);
        System.out.println(result);
    }

    public static double sum(double sourceSum) {
        double result = sourceSum;
        for (int i = 1626; i <= 2021; i++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println(result);
        }
        return result;
    }
}
