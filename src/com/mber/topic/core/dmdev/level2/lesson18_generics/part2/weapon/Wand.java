package com.mber.topic.core.dmdev.level2.lesson18_generics.part2.weapon;

public class Wand implements MagicWeapon {
    @Override
    public int getDamage() {
        return 20;
    }

    public String getName() {
        return "wand";
    }
}
