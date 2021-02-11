package com.mber.dmdev.level2.task0702;
/**
 * 1. Создать класс, описывающий промежуток времени.
 *    Сам промежуток времени должен задаваться тремя свойствами:
 *    секундами, минутами и часами.
 *    Создать метод для получения полного количества секунд в объекте
 *    Создать два конструктора: первый принимает общее количество
 *    секунд, второй - часы, минуты и секунды по отдельности.
 *    Создать метод для вывода данных.
 */
public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval1 = new TimeInterval(30, 2, 1);
        timeInterval1.print();

        TimeInterval timeInterval2 = new TimeInterval(timeInterval1.totalSeconds()+200);
        timeInterval2.print();

        timeInterval1.sum(timeInterval2).print();

    }
}
