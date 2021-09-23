package com.mber.topic.core.dmdev.level2.lesson18_generics.part2.weapon;

public class Bow implements RangeWeapon {
    @Override
    public int getDamage() {
        return 10;
    }

    public String getName() {
        return "bow";
    }
}
