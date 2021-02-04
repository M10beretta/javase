package javarush.questsyntax.task1631;

/*
Factory method pattern
*/

import javarush.questsyntax.task1631.common.ImageReader;
import javarush.questsyntax.task1631.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}