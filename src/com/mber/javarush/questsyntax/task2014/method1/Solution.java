package com.mber.javarush.questsyntax.task2014.method1;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/*
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) {
        Solution savedObject = new Solution(4); System.out.println(savedObject);

        String file = "D:\\Study\\programming\\practice\\src\\com.mber.javarush" +
                "\\questsyntax\\task2014\\method1\\file.ser";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            out.writeObject(savedObject);
            Solution loadedObject = (Solution) in.readObject(); System.out.println(loadedObject);

            System.out.println(savedObject.equals(loadedObject));
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return Objects.equals(string, solution.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
