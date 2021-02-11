package com.mber.javarush.task.analyz.task1408;

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 120;
    }

    @Override
    public String getDescription() {
        return  String.format("%s Моя страна - %s. Я несу %d яиц в месяц.",
                super.getDescription(), Country.MOLDOVA, getCountOfEggsPerMonth());
    }
}
