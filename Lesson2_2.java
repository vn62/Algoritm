package com.ex.Algoritmic_2;

public class Lesson2_2 {
    public Lesson2_2(int[][] array){
        Algoritm.showArray(array);

        System.out.println("    Результат 2_2: ");
        int sizeRow = array.length;
        int sizeCol = array[0].length;
        System.out.println("    Строк " + sizeRow + " столбцов " + sizeCol);

        System.out.println("    Диагональ главная: ");
        for (int i = 0; i < sizeRow; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
        System.out.println("    Диагональ побочная: ");
        for (int i = 0; i < sizeRow; i++) {
            System.out.print(array[sizeRow - i - 1][i] + " ");
        }
        System.out.println();
    }
}
