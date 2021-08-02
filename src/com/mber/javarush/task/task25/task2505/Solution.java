package com.mber.javarush.task.task25.task2505;

/*
Без дураков
*/

public class Solution {
    public static void main(String[] args) {
        MyThread myThread = new Solution().new MyThread("super secret key");
        myThread.start();
    }

    public class MyThread extends Thread {
        private String secretKey;

        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }

        private class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                try {
                    Thread.sleep(500);
                    System.out.printf("%s, %s, %s%n%n", ((MyThread) t).secretKey, t.getName(), e.getMessage());
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }


}