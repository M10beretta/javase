package com.mber.javarush.task.task1827.method1;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
//        {
//            args[0] = "-c";
//            args[1] = "aaaaaa";
//            args[2] = "222";
//            args[3] = "50";
//            String keyboardData = "D:\\Study\\programming\\practice\\src\\com.mber.javarush\\task\\task1827\\file1.txt.txt.txt";
//            System.setIn(new ByteArrayInputStream(keyboardData.getBytes()));
//        }
        if (args.length == 0 || !args[0].equals("-c")) {
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        int id;
        int maxId = 0;
        while (fileReader.ready()) {
            id = Integer.parseInt(fileReader.readLine().substring(0, 8).trim());
            if (id > maxId) maxId = id;
        }
        fileReader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(new Product(maxId, args[1], args[2], args[3]).toString());
        writer.close();

    }

    public static class Product {
        private int maxId;
        private final String name;
        private final String price;
        private final String quantity;

        public Product(int maxId, String name, String price, String quantity) {
            this.maxId = maxId;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("\n%-8d%-30.30s%-8.8s%-4.4s", ++maxId, name, price, quantity);
        }
    }
}





