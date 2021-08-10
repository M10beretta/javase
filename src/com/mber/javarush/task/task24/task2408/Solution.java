package com.mber.javarush.task.task24.task2408;

/*
Как избежать Copy+Paste
*/

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}