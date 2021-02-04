package various.serialization._1;
/*
http://ccfit.nsu.ru/~deviv/courses/oop/java_ser_rus.html
Изучите секреты Java Serialization API
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;

public class InflateTime {
    public static void main(String[] args) {
        String filename = "D:\\Study\\programming\\practice\\src\\various\\serialization\\_1\\file.ser";
        if (args.length > 0) {
            filename = args[0];
        }
        PersistentTime time = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            time = (PersistentTime) in.readObject();
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        // распечатать восстановленное время
        System.out.println("Время разложения: " + time.getTime());
        System.out.println();
        // распечатать текущее время
        System.out.println("Текущее время: " + Calendar.getInstance().getTime());
    }
}
