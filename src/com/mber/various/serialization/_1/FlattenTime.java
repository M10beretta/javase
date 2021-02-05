package com.mber.various.serialization._1;
/*
http://ccfit.nsu.ru/~deviv/courses/oop/java_ser_rus.html
Изучите секреты Java Serialization API
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FlattenTime {
    public static void main(String[] args) {
        String filename = "D:\\Study\\programming\\practice\\src\\com.mber.various\\serialization\\_1\\file.ser";
        if (args.length > 0) {
            filename = args[0];
        }
        PersistentTime time = new PersistentTime();
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(time);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
