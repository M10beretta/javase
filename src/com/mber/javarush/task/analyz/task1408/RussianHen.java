package com.mber.javarush.task.analyz.task1408;

public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription() {
        return  String.format("%s Моя страна - %s. Я несу %d яиц в месяц.",
                super.getDescription(), Country.RUSSIA, getCountOfEggsPerMonth());
    }
}
