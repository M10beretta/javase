package com.mber.topic.core.dmdev.level2.lesson15_OOP_principles_encapsulation;

public class Warrior extends Hero {
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " взмахнул мечом на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
