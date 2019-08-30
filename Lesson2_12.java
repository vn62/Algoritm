package com.ex.Algoritmic_2;

import java.util.Random;

public class Lesson2_12 {
    public Lesson2_12(int[][] array) {
        int sizeRow = array.length;
        int sizeCol = array[0].length;

        /* bubble sorting
        int [] arr = {1,5,3,7,8,9,2};
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if(arr[j] > arr[k]){
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for (int i: arr)  System.out.print(i + " ");
        */

        System.out.println("    Результат 2_12: ");
        System.out.println("    Строки отсортированы по возрастанию:");
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

        System.out.println("    Строки отсортированы по убыванию:");
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
