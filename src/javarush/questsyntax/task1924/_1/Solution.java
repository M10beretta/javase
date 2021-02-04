package javarush.questsyntax.task1924._1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader data = new BufferedReader(new FileReader(reader.readLine()));) {

            while (data.ready()) {
                String result = data.readLine();
                for (int i = 0; i <= 12; i++) {
                    result = result.replaceAll("\\b" + i + "\\b", map.get(i));
                }
                System.out.println(result);
            }
        } catch (IOException e){
            /* NOP */
        }
    }
}


/*
считаем имя файла
считаем данные построчно
делим на пробелы и добавим в лист
выводим в консоль с заменой



 */