package com.mber.topic.beginner.task.search_max_in_array;

import java.util.Arrays;

// Найти максимальное число в массиве

public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 2, 6, 8, 5, 3};

        System.out.println(Arrays.stream(nums).reduce(Integer::max).getAsInt());

        System.out.println(getMax(nums));
    }

    private static int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (max < num) max = num;
        }
        return max;
    }
}
