package com.mber.javarush.posts.post2138;
import java.io.*;

/*
Подмена System.in
 */

public class Main {

    public static void main(String[] args) throws IOException {

        String greetings = "Привет! Меня зовут Амиго!\nЯ изучаю Java на сайте com.mber.javarush.\nОднажды я стану крутым программистом!\n";
        byte[] bytes = greetings.getBytes();

        InputStream inputStream = new ByteArrayInputStream(bytes);

        System.setIn(inputStream);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while ((str = reader.readLine()) != null) {

            System.out.println(str);
        }

    }
}

