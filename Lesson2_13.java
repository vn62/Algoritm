package com.ex.Algoritmic_2;

import java.util.Random;

public class Lesson2_13 {
    public static void main(String[] args) {
        new Lesson2_13(Algoritm.randArray(10,10,10));
    }

    public Lesson2_13(int[][] array) {
        int sizeRow = array.length;
        int sizeCol = array[0].length;


        System.out.println("Столбцы отсортированы по возрастанию:");
        for (int i = 0; i < sizeRow; i++) {

            for (int j = 0; j < sizeCol - 1; j++) {
                for (int k = j + 1; k < sizeCol; k++) {
                    if(array[j][i] > array[k][i]){
                        int temp = array[j][i];
                        array[j][i] = array[k][i];
                        array[k][i] = temp;
                    }
                }
            }
        }
        Algoritm.showArray(array);

        System.out.println("Столбцы отсортированы по убыванию:");
        for (int i = 0; i < sizeRow; i++) {

            for (int j = 0; j < sizeCol - 1; j++) {
                for (int k = j + 1; k < sizeCol; k++) {
                    if(array[j][i] < array[k][i]){
                        int temp = array[j][i];
                        array[j][i] = array[k][i];
                        array[k][i] = temp;
                    }
                }
            }
        }
        Algoritm.showArray(array);
    }
}
