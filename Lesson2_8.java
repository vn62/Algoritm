package com.ex.Algoritmic_2;

import java.util.Scanner;

public class Lesson2_8 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{8,7,6,5},{15,10,11,12}, {15,10,11,12}};
        new Lesson2_8(array);
    }
    public Lesson2_8(int[][] array) {
        Algoritm.showArray(array);

        int sizeRow = array.length;
        int sizeCol = array[0].length;

        Scanner scan = new Scanner(System.in);
        int k = 0;
        int p = 0;
        System.out.println("Введите номер столбца: ");
        while (true) {
            k = scan.nextInt();
            if(k <= sizeCol && k != 0) break;
        }
        System.out.println("Введите номер столбца для замены: ");
        while (true) {
            p = scan.nextInt();
            if (p <= sizeCol && p != 0) break;
        }
        scan.close();

        for (int i = 0; i < sizeCol ; i++) {
            int temp = array[i][k-1];
            array[i][k-1] = array[i][p-1];
            array[i][p-1] = temp;
        }

        System.out.println("Матрица, в которой столбец " + k + " заменем " + " строкой " + p + " и наоборот: ");
        Algoritm.showArray(array);
        System.out.println();
    }
}
