package com.mber.alishev.algorithms.lesson7;

// Жадный алгоритм
/* даны точки заправок с расстоянием от начала пути и расстояние конечной точки.
 найти минимальное количество остановок пути. емкость бака на 400 км */

public class GreedyAlgorithm {
    public static void main(String[] args) {
        int[] stations = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(stations, 400));
    }

    private static int minStops(int[] stations, int capacity) {
        int result = 0;
        int currentStop = 0;

        while (currentStop < stations.length - 1) { // итерируемся
            int dynamicStop = currentStop;

            while (dynamicStop < stations.length-1 // пока не превысили количество остановок
                    && stations[dynamicStop + 1] - stations[currentStop] <= capacity)  // и хватает топлива от первой остановки до исследуемой
                dynamicStop++; // исследуем следующую точку


            if (currentStop == dynamicStop) // если предыдущий цикл не нашел следующую точку
                return -1;

            if (dynamicStop < stations.length - 1) // eсли точка не является конечной
                result++;

            currentStop=dynamicStop;
        }
        return result;
    }
}
