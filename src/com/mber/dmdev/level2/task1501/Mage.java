package com.mber.dmdev.level2.task1501;

public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(this.getName() + " произносит заклинание");
        enemy.takeDamage(20);
    }
}
