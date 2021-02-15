package com.mber.dmdev.level2.lesson18.part2;

import com.mber.dmdev.level2.lesson18.part2.heroes.*;
import com.mber.dmdev.level2.lesson18.part2.weapon.*;

public class WeaponRunner {
    public static void main(String[] args) {

//        Archer<Bow> archer = new Archer<Bow>("Леголас" , 15);
//        Warrior<Sword> warrior = new Warrior<>("Боромир", 15);
        Mage<Wand> mage = new Mage<>("Гэндольф" , 20);
        printWeaponDamage(mage);
    }

    public static void printWeaponDamage(Hero<? extends Weapon> hero){
        System.out.println(hero.getWeapon().getDamage());
    }
}

