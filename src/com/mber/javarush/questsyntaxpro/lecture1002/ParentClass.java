package com.mber.javarush.questsyntaxpro.lecture1002;

public class ParentClass {
    public String a = Main.print("ParentClass.a");
    public String b = Main.print("ParentClass.b");

    public ParentClass() {
        Main.print("PatentClass.constructor");
    }
}
