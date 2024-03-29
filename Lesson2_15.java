package com.ex.Algoritmic_2;

public class Lesson2_15 {
    public static void main(String[] args) {
        new Lesson2_15(Algoritm.randArray(10,10,10));
    }

    public Lesson2_15(int[][] array) {
        int sizeRow = array.length;
        int sizeCol = array[0].length;

        int maxNum = 0;
        for (int i = 0; i < sizeRow ; i++) {
            for (int j = 0; j < sizeCol; j++) {
                if(array[i][j]>maxNum) maxNum = array[i][j];
            }
        }
        System.out.println("Максиммальный элемент: " + maxNum);

        System.out.println("Замена все нечетные элементы на максимальный:");
        for (int i = 0; i < sizeRow ; i++) {
            for (int j = 0; j < sizeCol; j++) {
                if(array[i][j]%2 != 0) array[i][j] = maxNum;
            }
        }

        Algoritm.showArray(array);
        System.out.println();
    }
}
