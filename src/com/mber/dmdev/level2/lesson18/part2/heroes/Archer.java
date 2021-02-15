package com.mber.dmdev.level2.lesson18.part2.heroes;

import com.mber.dmdev.level2.lesson18.part2.weapon.RangeWeapon;

/*
public class Archer<T extends RangeWeapon> extends Hero<T> {
    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стрельнул из лука в " + enemy.getName());
        if (enemy.isAlive()) wolf.attackEnemy(enemy);
    }

    private class Wolf {

        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " и " + Archer.this.getName() + " наносят совместный урон");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
*/
