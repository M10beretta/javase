package com.mber.topic.core.dmdev.level2.lesson18_generics.part2;


import com.mber.topic.core.dmdev.level2.lesson18_generics.part2.heroes.*;
import com.mber.topic.core.dmdev.level2.lesson18_generics.part2.weapon.Bow;
import com.mber.topic.core.dmdev.level2.lesson18_generics.part2.weapon.Sword;
import com.mber.topic.core.dmdev.level2.lesson18_generics.part2.weapon.Wand;

public class Battle {
    public static void main(String[] args) {
        Hero<Bow> archer = new Archer<Bow>("Леголас" , new Bow());
        Hero<Sword> warrior = new Warrior<>("Боромир", new Sword());
        Hero<Wand> mage = new Mage<>("Гэндольф" , new Wand());
        Enemy enemy = new Enemy("Зомби", 100);
        attackEnemy(enemy, warrior, mage, archer);

    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) hero.attackEnemy(enemy);
            }
        }
    }
}
