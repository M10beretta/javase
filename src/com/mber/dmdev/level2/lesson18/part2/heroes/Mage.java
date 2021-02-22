package com.mber.dmdev.level2.lesson18.part2.heroes;

import com.mber.dmdev.level2.lesson18.part2.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {

    public Mage(String name, T weapon) {
        super(name, weapon);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " сотворил заклинание на " + enemy.getName());
        enemy.takeDamage(getWeapon().getDamage());
    }
}
