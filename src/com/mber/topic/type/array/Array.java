package com.mber.topic.type.array;

import java.util.Arrays;

class Array {
    public static void main(String[] args) {
        String[] ar11 = new String[3], ar12 = new String[]{"0", "1", "2"},
                ar13 = {"0", "1", "2"};
        String[][] ar21 = new String[2][3], ar22 = new String[][]{{"00", "01"}, {"10", "11"}, {"20", "21", "22"}},
                ar23 = {{"00", "01"}, {"10", "11"}, {"20", "21", "22"}};
        String[][][] ar33 = {{{"000", "001"}, {"010", "011"}, {"020", "021", "022"}}, {{"100", "101"}, {"110", "111"}, {"120", "121", "122"}}};
        int[][][][] ar41 = new int[3][3][3][4];

        System.out.println(Arrays.toString(ar13));
        System.out.println(Arrays.deepToString(ar33));

        for (int i = 0; i < ar23.length; i++) {         // column
            for (int j = 0; j < ar23[i].length; j++)    // line
                System.out.print(ar23[i][j] + " ");
            System.out.println();
        }

        for (String[] column : ar23) {
            for (String lineElement : column)
                System.out.print(lineElement + " ");
            System.out.println();
        }
    }
}
