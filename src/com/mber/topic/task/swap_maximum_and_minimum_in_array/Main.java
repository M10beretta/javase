package com.mber.topic.task.swap_maximum_and_minimum_in_array;

import java.util.Arrays;

// Дан массив. Поменять местами максимальное и минимальное значение.

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{6, 7, 3, 4, 5, -7};

        System.out.println(Arrays.toString(nums));

        int minValue = nums[0];
        int maxValue = nums[0];

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minValue) {minIndex = i;minValue = nums[i];}
            if (nums[i] > maxValue) {maxIndex = i;maxValue = nums[i];}
        }

        nums[minIndex] = maxValue;
        nums[maxIndex] = minValue;

        System.out.println(Arrays.toString(nums));
    }
}




