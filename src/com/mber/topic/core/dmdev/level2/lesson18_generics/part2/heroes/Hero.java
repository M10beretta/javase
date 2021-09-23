package com.mber.topic.core.dmdev.level2.lesson18_generics.part2.heroes;

import com.mber.topic.core.dmdev.level2.lesson18_generics.part2.weapon.Weapon;

public abstract class Hero <T extends Weapon>{

    private final String name;
    private final T weapon;

    public Hero(String name, T weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }

    public T getWeapon() {
        return weapon;
    }
}

