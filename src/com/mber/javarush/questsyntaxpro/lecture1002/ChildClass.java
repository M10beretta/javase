package com.mber.javarush.questsyntaxpro.lecture1002;

public class ChildClass extends ParentClass {
    public String c = Main.print("ChildClass.c");
    public String d = Main.print("ChildClass.d");

    public ChildClass() {
        Main.print("ChildClass.constructor");
    }
}
