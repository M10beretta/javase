package com.mber.dmdev.level2.lesson22;

import java.io.File;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\practice\\java\\src\\com\\mber\\dmdev\\level2\\lesson22\\test.txt");
        File file = new File("src/com/mber/dmdev/level2/lesson22/test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());

        File dir = new File("src/com/mber/dmdev/level2/lesson22");
        System.out.println(dir.exists());

    }
}
