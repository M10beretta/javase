package com.mber.topic.core.shildt._157_using_break_operator_as_a_form_of_goto_operator;

public class Main {

    public static void main(String args[]) {
        extracted1();
        System.out.println();
        extracted2();
    }

    private static void extracted1() {
        // Применение оператора break в качестве цивилизованной
        // формы оператора goto
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second; // выход из блока second
                    System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println(
                    "Этот оператор следует за блоком second.");
        }
    }

    private static void extracted2() {
        // Применение оператора break для выхода из вложенных циклов class BreakLoop4 {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer; // выход из обоих циклов
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не будет выводиться");
        }
        System.out.println("Циклы завершены.");
    }
}
