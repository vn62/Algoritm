package com.ex.Algoritmic_2;

import java.util.Random;
import java.util.Scanner;

public class Lesson2_16 {
    public static void main(String[] args) {
        new Lesson2_16();
    }

    public Lesson2_16() {
        int n = 0;

        System.out.println("Введите порядок магического квадрата (больше 2): ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            while (true){
                n = scan.nextInt();
                if(n>2) break;
                else System.out.println("Порядок квадрата болжен быть больше 2");
            }
        }
        int[][] array = new int[n][n];
        System.out.println("Результат 2_16: ");

        int magiсConstant = n * ((int) Math.pow(n, 2) + 1) / 2;
        System.out.println("Магическая константа: " + magiсConstant);

        if (n % 2 != 0) {
            int i = n / 2;
            int j = n - 1;

            for (int num = 1; num <= n * n; ) {
                if (i == -1 && j == n) {
                    j = n - 2;
                    i = 0;
                } else {
                    if (j == n)
                        j = 0;
                    if (i < 0)
                        i = n - 1;
                }

                if (array[i][j] != 0) {
                    j -= 2;
                    i++;
                    continue;
                } else
                    array[i][j] = num++;
                i--;
                j++;
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = (n * i) + j + 1;
                }
            }

            // Top Left corner of Matrix
            for (int i = 0; i < n / 4; i++) {
                for (int j = 0; j < n / 4; j++)
                    array[i][j] = (n * n + 1) - array[i][j];
            }
            // Top Right corner of Matrix
            for (int i = 0; i < n / 4; i++) {
                for (int j = 3 * n / 4; j < n; j++)
                    array[i][j] = (n * n + 1) - array[i][j];
            }
            // Bottom Left corner of Matrix
            for (int i = 3 * n / 4; i < n; i++) {
                for (int j = 0; j < n / 4; j++)
                    array[i][j] = (n * n + 1) - array[i][j];
            }
            // Bottom Right corner of Matrix
            for (int i = 3 * n / 4; i < n; i++) {
                for (int j = 3 * n / 4; j < n; j++)
                    array[i][j] = (n * n + 1) - array[i][j];
            }
            // Centre of Matrix
            for (int i = n / 4; i < 3 * n / 4; i++) {
                for (int j = n / 4; j < 3 * n / 4; j++)
                    array[i][j] = (n * n + 1) - array[i][j];
            }
        }

        Algoritm.showArray(array);
    }
}



