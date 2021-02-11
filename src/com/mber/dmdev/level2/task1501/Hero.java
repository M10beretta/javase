package com.mber.dmdev.level2.task1501;

public class Hero {
    private final String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy){
        System.out.println(name + " атакует врага " + enemy.getName());
    }
}
