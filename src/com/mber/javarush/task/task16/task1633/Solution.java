package com.mber.javarush.task.task16.task1633;

/*
Отдебажим все на свете
*/

public class Solution {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);

        Thread threadA = new Thread(commonThread, "Нить 1");
        Thread threadB = new Thread(commonThread, "Нить 2");

        threadA.setUncaughtExceptionHandler(handler);
        threadB.setUncaughtExceptionHandler(handler);

        threadA.start();
        threadB.start();

        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(UncaughtExceptionHandler handler) {
            start();
        }

        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}

/* Max 31 уровень, Москва 1 марта 2020, 12:11
Спасибо, ваш комментарий навел на правильные мысли. Только в данном случае происходит не сужение,
а расширение типа (Runnable стоит на вершине иерархии наследования). Также замечу, что информация
об обработчике не поступает в конструктор нитей не по причине расширения типа, а лишь по той причине,
что все три объекта никак между собой не связаны в плане конфигурирования/инициализации - это три
отдельные нити. А значит нужно либо конфигурировать их все вместе (setDefaultExceptionHandler,
причем в правильном месте в коде, а не в конструкторе одной отдельной нити), либо каждую нить в
отдельности (setExceptionHandler). Также обратите внимание, что передавая Runnable в конструктор
Thread, вы передаете новой нити реализацию метода run() уже существующего Runnable-объекта.
Это означает, что в новую нить будет подставлена существующая реализация метода run() из объекта-аргумента.
Конструктор объекта-аргумента отрабатывает только в момент создания нити данного типа (т.е. только
один раз при создании TestedThread(handler)). Таким образом, при создании нити на основе существующего
Runnable-объекта, конструктор этого объекта не исполняется, а исполняется конструктор в классе Thread.
Передача Runnable-аргумента нужна только для неявного определения метода run() в создаваемом объекте.
В оригинальной версии данной задачи (т.е. той, которая поставляется нам для решения) изначально сконфигурирована
только одна нить - первая (TestedThread), которая на результат никак не влияет (именно поэтому из конструктора
данной нити можно вообще удалить setUncaughtExceptionHandler(handler), он для решения вообще не нужен,
т.к. нить не прерывается и успешно завершается сама без рейза каким-либо unchecked exceptions).
Итого, в задаче три нити, нам нужно для решения сконфигурировать две последние (threadA, threadB).
Причем конфигурирование должно быть выполнено до запуска нити, а не после.
Варианты как это сделать я описал. Дерзайте) */











