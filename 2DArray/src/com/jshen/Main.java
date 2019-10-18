package com.jshen;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[5][2];
        array[0][0] = 0;
        array[0][1] = 1;
        array[1][0] = 0;
        array[1][1] = 2;
        array[2][0] = 0;
        array[2][1] = 3;
        array[3][0] = 0;
        array[3][1] = 4;
        array[4][0] = 0;
        array[4][1] = 5;

        for(int i = 0; i < array.length; i++){
            System.out.println("location " + (i + 1) + " is " + "[" + array[i][0] + ", " + array[i][1] + "]" );
        }

    }
}
