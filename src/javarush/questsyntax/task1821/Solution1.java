package javarush.questsyntax.task1821;

import java.io.FileReader;
import java.io.IOException;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        if (args[0].length() == 0) return;

        FileReader fileReader = new FileReader(args[0]);
        int[] sym = new int[256];
        while (fileReader.ready()) {
            sym[fileReader.read()]++;
        }
        fileReader.close();
        for (int i = 32; i < sym.length; i++) {
            if (sym[i] > 0) System.out.printf("%c %d\n", i, sym[i]);
        }

//        for (int i = 0; i < 255; i++) {
//            System.out.println(i + " " + (char)i);
//        }
    }
}
