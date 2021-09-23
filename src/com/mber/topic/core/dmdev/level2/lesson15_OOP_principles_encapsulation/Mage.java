package com.mber.topic.core.dmdev.level2.lesson15_OOP_principles_encapsulation;

public class Mage extends Hero {
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " сотворил заклинание на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
