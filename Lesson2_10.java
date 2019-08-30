package com.ex.Algoritmic_2;

public class Lesson2_10 {
    public Lesson2_10(int[][] array) {
        Algoritm.showArray(array);
        int sizeRow = array.length;
        int sizeCol = array[0].length;
        System.out.println("Строк " + sizeRow + " столбцов " + sizeCol);

        System.out.println("    Результат 2_10: ");
        System.out.println("    Индексы положительных элементов матрицы ");
        for (int i = 0; i < sizeRow; i++) {
             if(array[i][i]>0)  System.out.print(i + " ");
        }
        System.out.println();
    }
}
