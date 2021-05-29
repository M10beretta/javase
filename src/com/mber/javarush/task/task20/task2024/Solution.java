package com.mber.javarush.task.task20.task2024;

/*
Знакомство с графами

Прочитать в дополнительных материалах о сериализации графов.
Дан ориентированный плоский граф Solution, содержащий циклы и петли.
Сериализовать Solution.
Все данные должны сохранить порядок следования.
*/

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();

    public static void main(String[] args) {

    }
}

/* Антон Никольский Уровень 35, Москва, Россия EXPERT 11 августа 2017, 19:11
Похоже смысл задачи заключается в гуглении "сериализация графа"))
А точнее в осознании того, что при сериализации 1 объекта в действительности
сериализуются все связанные с ним объекты, а также связанные с этими объектами
и т.д. Т.е. весь "граф" связанных объектов.*/

/* barracuda Уровень 41, Санкт-Петербург, Россия EXPERT 7 мая 2020, 16:41
вот эти вводные данные мне помогли понять хотя бы что такое граф и где он применяется.
Видео 6 минут.
https://www.youtube.com/watch?v=Tzc7Z-mOwxY

В купе со статьей, которую уже ранее публиковал Валихан, это дает понимание по нашей задаче:
http://espressocode.top/object-graph-java-serialization/*/


