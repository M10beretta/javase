package com.mber.topic.multithreading.megahub_ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Action {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Long> fact = executorService.submit(new Factorial(5));
        Future<Double> hypotenuse = executorService.submit(new Hypotenuse(2, 7));
        Future<Integer> nod = executorService.submit(new NOD(22, 33));

        System.out.printf(
                "Факториал: %20d%nГипотенуза: %21.2f%nНОД: %25d%nСумма всех значений: %13.2f",
                fact.get(), hypotenuse.get(), nod.get(), (fact.get() + hypotenuse.get() + nod.get())
        );

        executorService.shutdown();
    }
}
