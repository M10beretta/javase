package com.mber.javarush.task.analyz.task1417;

public class Ruble extends Money{
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
