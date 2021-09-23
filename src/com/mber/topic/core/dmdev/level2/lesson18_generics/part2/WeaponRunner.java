package com.mber.topic.core.dmdev.level2.lesson18_generics.part2;

import com.mber.topic.core.dmdev.level2.lesson18_generics.part2.heroes.*;
import com.mber.topic.core.dmdev.level2.lesson18_generics.part2.weapon.*;

public class WeaponRunner {
    public static void main(String[] args) {
        Hero<Bow> archer = new Archer<Bow>("Леголас" , new Bow());
        Hero<Sword> warrior = new Warrior<>("Боромир", new Sword());
        Hero<Wand> mage = new Mage<>("Гэндольф" , new Wand());

        checkReadiness(archer, warrior, mage);
    }

    private static void checkReadiness(Hero<Bow> archer, Hero<Sword> warrior, Hero<Wand> mage) {
        printWeaponDamage(archer);
        printWeaponDamage(warrior);
        printWeaponDamage(mage);
    }

    public static void printWeaponDamage(Hero<? extends Weapon> hero){
        System.out.println(hero.getName() + " " + hero.getWeapon().getName() + " " + hero.getWeapon().getDamage());
    }
}

