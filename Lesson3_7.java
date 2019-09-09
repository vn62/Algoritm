package com.ex.Algoritmic_2;

import java.util.Scanner;

public class Lesson3_7 {
    public static void main(String[] args) {
        new Lesson3_7();
    }


    public Lesson3_7() {
        int[] arrayA = {2, 3, 6, 8, 9, 15};
        int[] arrayB = {1, 4, 7, 10, 13, 14};
        int[] arrayC = new int[arrayA.length + arrayB.length];

        int indexOtnosite = 0;

        System.out.println("Индексы массива для вставки элементов другого массива: ");

        for (int i = 0; i < arrayB.length; i++) {
            int elementB = arrayB[i];
            for (int j = 0; j < arrayA.length; j++) {
                int elementA = arrayA[j];
                if (elementA > elementB) {
                    System.out.print(j + indexOtnosite + " ");
                    indexOtnosite++;
                    break;
                }
            }
        }


        System.out.println();
    }
}
