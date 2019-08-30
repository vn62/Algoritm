package com.ex.Algoritmic_2;

import java.util.Scanner;

public class Lesson2_7 {
    public Lesson2_7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("    Введите размерность матрицы: ");
        int num = 0;

        while (scan.hasNextInt()) {
            num = scan.nextInt();
            if (num > 0 && num % 2 == 0) break;
        }
        scan.close();

        int countPol = 0;
        double[][] array = new double[num][num];
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num; j++) {
                array[i][j] = Math.sin((Math.pow(i,2)-Math.pow(j,2))/num);
                if(array[i][j] > 0) countPol++;
            }
        }
        System.out.println("    Результат 2_7: ");
        Algoritm.showArray(array);
        System.out.println("    Положительных чисел " + countPol);
        System.out.println();
    }
}
