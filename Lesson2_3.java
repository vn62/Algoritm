package com.ex.Algoritmic_2;

import java.util.Scanner;

public class Lesson2_3 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{8,7,6,5},{15,10,11,12}, {15,10,11,12}};

        new Lesson2_3(array);
    }
    public Lesson2_3(int[][] array){
        Algoritm.showArray(array);

        int sizeRow = array.length;
        int sizeCol = array[0].length;

        Scanner scan = new Scanner(System.in);
        int k = 0;
        int p = 0;
        System.out.println("Введите номер строки: ");
        while (true) {
            k = scan.nextInt();
            if(k <= sizeRow && k != 0) break;
        }
        System.out.println("Введите номер столбца: ");
        while (true) {
            p = scan.nextInt();
            if (p <= sizeCol && p != 0) break;
        }
        scan.close();

        System.out.println("Строка " + k);
        for (int i = 0; i < sizeRow; i++) {
            System.out.print(array[k-1][i] + " ");
        }
        System.out.println();
        System.out.println("Столбец " + p);
        for (int i = 0; i < sizeCol; i++) {
            System.out.print(array[i][p-1] + " ");
        }
        System.out.println();
    }
}
