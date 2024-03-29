package com.mber.javarush.task.task25.task2510;

/*
Поживем - увидим
*/

public class Solution extends Thread {

    public Solution() {
        this.setUncaughtExceptionHandler((t, e) -> {
            String message;
            if (e instanceof Error) message ="Нельзя дальше работать";
            else if (e instanceof Exception) message ="Надо работать";
            else message = "Поживем - увидим";
            System.out.println(message);
        });
    }

    public static void main(String[] args) {
    }
}