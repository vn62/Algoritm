package com.ex.Algoritmic_2;

import java.util.Random;
import java.util.Scanner;

public class Lesson2_14 {
    public Lesson2_14(){
        Scanner scan = new Scanner(System.in);
        int m = 0;
        int n = 0;
        System.out.println("    Введите количество строк: ");
        while (true) {
            m = scan.nextInt();
            if(m != 0) break;
        }
        System.out.println("    Введите количество столбцов: ");
        while (true) {
            n = scan.nextInt();
            if (n != 0) break;
        }
        scan.close();

        int[][] array = new int[m][n];
        int sizeRow = array.length;
        int sizeCol = array[0].length;
        Random rand = new Random();

        int count = 0;

        System.out.println("    Результат 2_14: ");
        for (int i = 0; i < sizeCol; i++) {
            count = 0;

            while(true) {
                count = 0;
                for (int j = 0; j < sizeRow; j++){
                    array[j][i] = rand.nextInt(2);
                }

                for (int j = 0; j < sizeRow; j++) {
                    if(array[j][i] == 1) count++;
                }

                if(count == i + 1) break;
            }
        }

        System.out.println("    Массив: ");
        Algoritm.showArray(array);
        System.out.println();
    }
}
