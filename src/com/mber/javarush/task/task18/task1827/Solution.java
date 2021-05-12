package com.mber.javarush.task.task18.task1827;

import java.io.*;

/*
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        args = new String[]{"-c", "Майка супермен", "110.3", "50"};
//        String keyboard = "src/com/mber/javarush/task/task18/task1827/file.txt";
//        System.setIn(new ByteArrayInputStream(keyboard.getBytes()));

        if (args.length == 0 || !args[0].equals("-c")) return;
        var consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file = consoleReader.readLine();

        try (var reader = new BufferedReader(new FileReader(file));
             var writer = new BufferedWriter(new FileWriter(file, true))) {
            int maxId = 0;
            while (reader.ready()) {
                int id = Integer.parseInt(reader.readLine().substring(0, 8).trim());
                if (id > maxId) maxId = id;
            }
            writer.write(new Product(maxId, args[1], args[2], args[3]).toString());
        }
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
            return String.format("%-8.8s%-30.30s%-8.8s%-4.4s%n", ++maxId, name, price, quantity);
        }
    }
}





