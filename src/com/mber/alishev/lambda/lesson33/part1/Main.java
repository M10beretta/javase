package com.mber.alishev.lambda.lesson33.part1;

// лямбда выражения и анонимные классы

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10, 15);
        System.out.println(a + "\n");
    }
}

class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                System.out.println("Hello");
                System.out.println("Goodbye");
                return x + y;
            }
        });

        runner.run((int x, int y) -> {
            System.out.println("Hello");
            System.out.println("Goodbye");
            return x + y;
        });

        runner.run(Integer::sum);

        /* число не должно изменяться
        модификатор final либо константа неявно (не изменять обозначение) */
        final int a = 1;
        runner.run((x, y) -> x + y + a);
    }
}

/*
различия лямбда выражений от анонимных классов:
1 не можем передать два метода
2 нет собственной области видимости (scope),
  не можем создать переменную с тем же названием
*/



