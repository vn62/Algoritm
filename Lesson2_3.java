package com.ex.Algoritmic_2;

import java.util.Scanner;

public class Lesson2_3 {
    public Lesson2_3(int[][] array){
        Algoritm.showArray(array);

        System.out.println("    Результат 2_3: ");
        int sizeRow = array.length;
        int sizeCol = array[0].length;
        System.out.println("    Строк " + sizeRow + " столбцов " + sizeCol);

        Scanner scan = new Scanner(System.in);
        int k = 0;
        int p = 0;
        System.out.println("    Введите номер строки: ");
        while (true) {
            k = scan.nextInt();
            if(k <= sizeRow && k != 0) break;
        }
        System.out.println("    Введите номер столбца: ");
        while (true) {
            p = scan.nextInt();
            if (p <= sizeCol && p != 0) break;
        }
        scan.close();

        System.out.println("    Строка " + k);
        for (int i = 0; i < sizeRow; i++) {
            System.out.print(array[k-1][i] + " ");
        }
        System.out.println();
        System.out.println("    Столбец " + p);
        for (int i = 0; i < sizeCol; i++) {
            System.out.print(array[i][p-1] + " ");
        }
        System.out.println();
    }
}
