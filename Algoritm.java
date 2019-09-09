package com.ex.Algoritmic_2;

import java.util.Random;

public class Algoritm {
    public static void showArray(int[][] array){
        int sizeRow = array.length;
        int sizeCol = array[0].length;

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void showArray(double[][] array){
        int sizeRow = array.length;
        int sizeCol = array[0].length;

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                System.out.print(String.format("%.3f  ", array[i][j]));
            }
            System.out.println();
        }
    }

    public static int[][] randArray(int x, int y, int num){
        int[][] array = new int[x][y];

        Random rand = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(num == 0)
                    array[i][j] = rand.nextInt();
                else
                    array[i][j] = rand.nextInt(num);
            }
        }
        System.out.println("Исходный массив натуральных чисел: ");
        showArray(array);
        return array;
    }

    public static double[][] randArray(int x, int y, double num){
        double[][] array = new double[x][y];

        Random rand = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = rand.nextDouble();
            }
        }
        System.out.println("Исходный массив действительных чисел: ");
        showArray(array);
        return array;
    }
}
