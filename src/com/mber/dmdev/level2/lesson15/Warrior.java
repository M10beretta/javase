package com.mber.dmdev.level2.lesson15;

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
