package com.mber.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {

    }

    private static void extracted2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        String minString = list.get(0);
        String maxString = list.get(0);
        for(String sting : list){
            if (sting.length() < minString.length()){
                minString = sting;
            }
            if (sting.length() > maxString.length()){
                maxString = sting;
            }
        }

        for(String string : list){
            if (string.equals(minString) || string.equals(maxString)){
                System.out.println(string);
                break;
            }
        }
    }

    private static void extracted1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        String minSizeElement = strings.get(0);
        int positionMinElement = 0;
        String maxSizeElement = strings.get(0);
        int positionMaxElement = 0;
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() < minSizeElement.length()) {
                minSizeElement = strings.get(i);
                positionMinElement = i;
            } else if (strings.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = strings.get(i);
                positionMaxElement = i;
            }
        }

        if (positionMinElement < positionMaxElement) {
            System.out.println(minSizeElement);
        } else {
            System.out.println(maxSizeElement);
        }
    }
}