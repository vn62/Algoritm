package com.ex.Algoritmic_2;

public class Lesson2_2 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{8,7,6,5},{15,10,11,12}, {15,10,11,12}};

        new Lesson2_2(array);
    }
    public Lesson2_2(int[][] array){
        Algoritm.showArray(array);

        int sizeRow = array.length;
        int sizeCol = array[0].length;

        System.out.println("Диагональ главная: ");
        for (int i = 0; i < sizeRow; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
        System.out.println("Диагональ побочная: ");
        for (int i = 0; i < sizeRow; i++) {
            System.out.print(array[sizeRow - i - 1][i] + " ");
        }
        System.out.println();
    }
}
