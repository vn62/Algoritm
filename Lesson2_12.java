package com.ex.Algoritmic_2;

import java.util.Random;

public class Lesson2_12 {
    public static void main(String[] args) {
        new Lesson2_12(Algoritm.randArray(10,10,10));
    }
    public Lesson2_12(int[][] array) {
        int sizeRow = array.length;
        int sizeCol = array[0].length;

        System.out.println("Строки отсортированы по возрастанию:");
        for (int i = 0; i < sizeRow; i++) {

            for (int j = 0; j < sizeCol - 1; j++) {
                for (int k = j + 1; k < sizeCol; k++) {
                    if(array[i][j] > array[i][k]){
                        int temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
            }
        }
        Algoritm.showArray(array);

        System.out.println("Строки отсортированы по убыванию:");
        for (int i = 0; i < sizeRow; i++) {

            for (int j = 0; j < sizeCol - 1; j++) {
                for (int k = j + 1; k < sizeCol; k++) {
                    if(array[i][j] < array[i][k]){
                        int temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
            }
        }
        Algoritm.showArray(array);
    }
}
