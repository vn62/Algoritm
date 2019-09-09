package com.ex.Algoritmic_2;

public class Lesson2_10 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{8,7,6,5},{15,10,11,12}, {15,10,11,12}};
        new Lesson2_10(array);

    }
    public Lesson2_10(int[][] array) {
        Algoritm.showArray(array);
        int sizeRow = array.length;
        int sizeCol = array[0].length;

        System.out.println("Индексы положительных элементов главной диагонали матрицы ");
        for (int i = 0; i < sizeRow; i++) {
             if(array[i][i]>0)  System.out.print(i + " ");
        }
        System.out.println();
    }
}
