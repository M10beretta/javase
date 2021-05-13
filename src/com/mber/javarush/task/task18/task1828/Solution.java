package com.mber.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        args = new String[]{"-u", "2", "Майка супермен и еще много чего там", "100", "46"};
//        args = new String[]{"-d", "198478"};
//        String keyboard = "src/com/mber/javarush/task/task18/task1828/file.txt";
//        System.setIn(new ByteArrayInputStream(keyboard.getBytes()));

        if (args.length == 0 || !(args[0].equals("-u") || args[0].equals("-d"))) return;

        var consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file = consoleReader.readLine();

        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String line = reader.readLine();
                if (line.length() > 44) lines.add(line);
            }
        }

        for (int i = 0; i < lines.size(); i++) {
            if (args[1].equals(lines.get(i).substring(0, 8).trim())) {
                switch (args[0]) {
                    case "-u" -> lines.set(i, String
                            .format("%-8.8s%-30.30s%-8.8s%-4.4s", args[1], args[2], args[3], args[4]));
                    case "-d" -> lines.remove(i);
                }
            }
        }

        lines.sort((o1, o2) -> {
                    int a = Integer.parseInt(o1.substring(0, 8).trim());
                    int b = Integer.parseInt(o2.substring(0, 8).trim());
                    return a - b;
                }
        );

        StringBuilder builder = new StringBuilder();
        for (String line : lines) builder.append(line).append("\n");
        String data = builder.deleteCharAt(builder.length() - 1).toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(data);
        }
    }
}

