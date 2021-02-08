package com.mber.javarush.task.task1631;

/*
Factory method pattern
*/

import com.mber.javarush.task.task1631.common.ImageReader;
import com.mber.javarush.task.task1631.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}