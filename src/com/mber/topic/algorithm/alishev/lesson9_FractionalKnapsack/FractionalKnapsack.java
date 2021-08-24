package com.mber.topic.algorithm.alishev.lesson9_FractionalKnapsack;

// Жадный алгоритм, задача о рюкзаке

/*
Входные данные:
- Веса предметов w1, w2,..., wN
- Ценность каждого предмета (калории, цена и.т.д.) v1, v2,..., vN
- Вместимость рюкзака W
- Количество объектов n
Выходные данные:
- Максимальное значение ценности, которое помещается рюкзак с вместимостью W

решение: используя жадный алгоритм сортируем предметы в обратном порядке по удельной ценности и помещаем в рюкзак

если предметы делить нельзя, то жадный алгоритм не походит и необходимо использовать динамическое программирование
*/

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);
        final Item[] items = {item1, item2, item3};

        System.out.println(Arrays.toString(items));
        System.out.println(calculateMaxValue(items));
    }

    private static int calculateMaxValue(Item[] items) {
        Arrays.sort(items, Comparator // O(n log n)
                .comparingDouble(Item::valuePerUnitOfWeight) // сравниваем по удельной ценности
                .reversed()); // от большего к меньшему
        final int W = 7; // вместимость рюкзака
        int valueSoFar = 0; // аккумулировать ценность
        int weightSoFar = 0; // аккумулировать вес
        int currentItem = 0; // индекс текущего предмета
        while (currentItem < items.length && weightSoFar != W) {  // пока есть предметы и место в рюкзаке
            if (weightSoFar + items[currentItem].getWeight() < W) { // если можем вместить весь предмет
                // берем объект целиком
                valueSoFar += items[currentItem].getValue(); // прибавляем значение
                weightSoFar += items[currentItem].getWeight(); // прибавляем вес
            } else {  // если не можем вместить весь предмет
                // берем часть объекта
                double usefulPart = (W - weightSoFar) / (double) items[currentItem].getWeight(); // полезная часть предмета
                valueSoFar += usefulPart * items[currentItem].getValue(); // прибавляем ценность полезной части предмета
                weightSoFar = W; // рюкзак заполнен
            }
            currentItem++;
        }
        return valueSoFar;
    }
}

class Item {
    private final int weight;
    private final int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnitOfWeight() {
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return
                "{w:" + weight + ", v:" + value + '}';
    }
}
