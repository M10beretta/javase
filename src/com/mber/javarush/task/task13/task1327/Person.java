package com.mber.javarush.task.task13.task1327;



public class Person implements RepkaItem{
    private final String name;
    private final String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public void pull(Person person){
        System.out.println(name + " за " + person.getNamePadezh());
    }

    public String getNamePadezh() {
        return namePadezh;
    }

}

