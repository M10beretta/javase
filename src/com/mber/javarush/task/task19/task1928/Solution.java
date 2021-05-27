package com.mber.javarush.task.task19.task1928;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/*
Исправить ошибку. Классы и интерфейсы
*/

public class Solution {
    {
        System.out.println("This is the Solution class");
    }

    public static void main(String... args) throws IOException {

        args = new String[]{"src/com/mber/javarush/task/task19/task1928/file.txt",
                "com/mber/javarush/task/task19/task1928/file.png", "a", "b", "c"};

        try (FileOutputStream outputStream = new FileOutputStream(args[0]);
             InputStream is = Solution.class.getClassLoader().getResourceAsStream(args[1])) {

            byte[] b = new byte[Objects.requireNonNull(is).available()];
            outputStream.write(is.read(b));

            int value = 123_456_789;
            System.out.println(value);

            Example result = null;

            for (int i = 2; i < 5; i++) {

                switch (args[i]) {
                    case "a" -> result = new Solution().new A();
                    case "b" -> result = new Solution().new B();
                    case "c" -> result = new Solution().new C();
                }

                if (result instanceof C p) {
                    System.out.println(p.getClass().getSimpleName());
                }
            }

        } catch (IOException ignored) {
        }
    }

    interface Example {
    }

    class A implements Example {
        {
            System.out.println("This is the A class");
        }
    }

    class B implements Example {
        {
            System.out.println("This is the B class");
        }
    }

    class C extends A {
        {
            System.out.println("This is the C class");
        }
    }
}





