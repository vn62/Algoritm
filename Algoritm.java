package com.ex.Algoritmic_2;

import java.util.Random;

public class Algoritm {
    public static void main(String[] args) {
//        int[] array = {2,10,1,5,1,6,3};
//        new Lesson1_1( array , 2);
//        float[] array2 = {1,-2.2f,10.5f,-4,1,0,6.5f,3};
//        new Lesson1_2(array2 , 7);
//        new Lesson1_3(array2);
//        new Lesson1_4(array2);
//        new Lesson1_5(array);
//        float[] array3 = {1,2,3.2f,4,5,6,7,8};
//        new Lesson1_6(array3);
//        float[] array4 = {1,10,3,4,5,6,7,8};
//        new Lesson1_7(array4);
//        new Lesson1_8(array);
//        int[] array5 = {1,2,3,4,5,6,7,8,9,10,12,12};
//        new Lesson1_9(array5);
//        new Lesson1_10(array5);

//        int[][] array = {{1,2,3,4},{8,7,6,5},{15,10,11,12}, {15,10,11,12}};
//        new Lesson2_1(array);
//        new Lesson2_2(array);
//        new Lesson2_3(array);

//          new Lesson2_4();
//          new Lesson2_5();
//          new Lesson2_6();
//          new Lesson2_7();
//        int[][] array = {{1,2,3,20},{8,1,6,5},{15,10,-5,12},{15,10,11,12}};
//        new Lesson2_8(array);
//        new Lesson2_9(array);
//        new Lesson2_10(array);
//        new Lesson2_11();
//        new Lesson2_12(randArray(10,10,10));
//        new Lesson2_13(randArray(10,10,10));
//        new Lesson2_14();
        new Lesson2_15(randArray(10,10,10));
    }

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
        System.out.println("    Исходный массив натуральных чисел: ");
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
        System.out.println("    Исходный массив действительных чисел: ");
        showArray(array);
        return array;
    }
}
