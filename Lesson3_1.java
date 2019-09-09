package com.ex.Algoritmic_2;

import java.util.Scanner;

public class Lesson3_1 {
    public static void main(String[] args) {
        new Lesson3_1();
    }

    public Lesson3_1() {
        int[] arrayMain = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] arrayInsert = {20,21,22,23,24,25};

        System.out.println("Введите начальный индекс для вставки элементов массива: ");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt());
        int index = scan.nextInt();
        int sizeInserts = arrayInsert.length;


        for (int i = arrayMain.length; i != 0; i--) {
            if(i + index + sizeInserts < arrayMain.length)
                arrayMain[i + index + sizeInserts] = arrayMain[i + index];
        }

        for (int j = 0; j < arrayInsert.length; j++) {
            if(j + index + 1 < arrayMain.length)
               arrayMain[j + index + 1] = arrayInsert[j];
        }

        System.out.println("Объединенный массив: ");
        for (int  i = 0; i < arrayMain.length; i++)
            System.out.print(arrayMain[i] + " ");

        System.out.println();
    }
}
