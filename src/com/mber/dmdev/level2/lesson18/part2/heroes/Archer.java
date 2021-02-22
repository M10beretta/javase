package com.mber.dmdev.level2.lesson18.part2.heroes;

import com.mber.dmdev.level2.lesson18.part2.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {
    private final Wolf wolf;

    public Archer(String name, T weapon) {
        super(name, weapon);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стрельнул из лука в " + enemy.getName());
        if (enemy.isAlive()) wolf.attackEnemy(enemy);
    }

    private class Wolf {

        private final String name;
        private final int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " и " + Archer.this.getName() + " наносят совместный урон");
            enemy.takeDamage(damage + Archer.this.getWeapon().getDamage());
        }
    }

}
