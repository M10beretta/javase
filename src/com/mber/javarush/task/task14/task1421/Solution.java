package com.mber.javarush.task.task14.task1421;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() + "\n" + Singleton.getInstance());
        System.out.println(new Solution() + "\n" + new Solution());
    }
}