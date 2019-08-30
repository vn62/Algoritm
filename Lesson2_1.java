package com.ex.Algoritmic_2;

public class Lesson2_1 {
    public Lesson2_1(int[][] array){
        Algoritm.showArray(array);
        
        System.out.println("    Результат 2_1: ");
        int sizeRow = array.length;

        System.out.println("    Все нечетные строки ");
        for (int i = 0; i < sizeRow; i++) {
            if(i%2 == 0){
                if(array[i][0] > array[i][array[i].length-1]) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
