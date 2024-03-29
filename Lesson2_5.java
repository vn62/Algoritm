package com.ex.Algoritmic_2;

import java.util.Scanner;

public class Lesson2_5 {
    public static void main(String[] args) {
        new Lesson2_5();
    }
    public Lesson2_5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int num = 0;
        while (scan.hasNextInt()) {
            num = scan.nextInt();
            if (num > 0 && num % 2 == 0) break;
        }
        scan.close();

        int[][] array = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(j < num - i) array[i][j] = i+1;
                else array[i][j] = 0;
            }
        }
        System.out.println("Квадратная матрица по образцу: ");
        Algoritm.showArray(array);
        System.out.println();
    }
}
