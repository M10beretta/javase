package com.mber.topic.core.dmdev.level2.lesson18_generics.part2.weapon;

public class Sword implements MeleeWeapon {
    @Override
    public int getDamage() {
        return 15;
    }

    public String getName() {
        return "sword";
    }
}
