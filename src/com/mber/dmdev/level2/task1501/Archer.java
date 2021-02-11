package com.mber.dmdev.level2.task1501;

public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(this.getName() + " стреляет из лука");
        enemy.takeDamage(10);
    }
}
