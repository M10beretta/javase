package com.mber.dmdev.level2.lesson19.task;

import java.util.*;

/**
 * 4. Сложить два многочлена заданной степени, если коэффициенты
 * многочлена хранятся в объекте HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 * Вывести результирующий многочлен в виде строки: ax^6 + bx^4 +
 * cx^3 + dx + 8
 */
public class Task4 {
    public static void main(String[] args) {
        Map<Integer, Integer> polynomial1 = Map.of(
                0, 5,
                1, 3,
                3, 2,
                5, 4,
                6, 7
        );
        Map<Integer, Integer> polynomial2 = Map.of(
                0, 5,
                3, 4,
                5, 5,
                6, 1
        );

        // 8x^6 + 9x^5 + 6x^3 + 3x^1 + 10

        Map<Integer, Integer> sum = sum(polynomial1, polynomial2);
        System.out.println(convertToString(sum));
    }


    public static String convertToString(Map<Integer, Integer> map) {
        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {

            String value = entry.getKey() == 0
                    ? String.valueOf(entry.getValue())
                    : entry.getValue() + "x^" + entry.getKey();
            list.add(value);
        }
        return String.join(" + ", list);
    }

    public static Map<Integer, Integer> sum(Map<Integer, Integer> polynomial1,
                                            Map<Integer, Integer> polynomial2) {
        Map<Integer, Integer> polynomialResult = new HashMap<>(polynomial1);
        for (Map.Entry<Integer, Integer> entry : polynomial2.entrySet()) {
//            Integer value = polynomialResult.getOrDefault(entry.getKey(), 0);
//            polynomialResult.put(entry.getKey(), value + entry.getValue());

            polynomialResult.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return polynomialResult;
    }
}

/*
вариант 1
создаем копию мап 1
перебираем мап 2 {
получаем значение из копии мап 1 по ключу из мап 2,  либо 0 если в мап 1 такого ключа нет
(полученое значени из копии мап 1 либо 0 + значение по этому же ключу из мап 2 ) добавляем с перезаписью в копию мап 1
}
возвращаем копию мап 1
_______________

вариант 2
создаем копию мап 1
перебираем мап 2 {
выполняем слияние с мап 1 (ключ элемента мап 2, значение элемента мап 2, занчение мап 2 + значение мап 1)
}


 */