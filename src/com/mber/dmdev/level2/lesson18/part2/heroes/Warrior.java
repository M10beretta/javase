package com.mber.dmdev.level2.lesson18.part2.heroes;

import com.mber.dmdev.level2.lesson18.part2.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    public Warrior(String name, T weapon) {
        super(name, weapon);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " взмахнул мечом на " + enemy.getName());
        enemy.takeDamage(getWeapon().getDamage());
    }
}
