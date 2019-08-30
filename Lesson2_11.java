package com.ex.Algoritmic_2;

import java.util.Random;

public class Lesson2_11 {
    public Lesson2_11(){
        int[][] array = new int[10][20];
        int sizeRow = array.length;
        int sizeCol = array[0].length;
        Random rand = new Random();

        int count = 0;
        System.out.println("    Результат 2_11: ");
        System.out.println("    Строки которые содержит 3 и более раз число 5:");
        for (int i = 0; i < sizeRow; i++) {
            count = 0;
            for (int j = 0; j < sizeCol; j++) {
                int num = rand.nextInt(16);
                array[i][j] = num;
                if(num == 5) count++;
            }
            if(count > 2) System.out.println("Стр " + (i + 1) + " содержит " + count);
        }

        System.out.println("    Массив: ");
        Algoritm.showArray(array);
        System.out.println();
    }
}
