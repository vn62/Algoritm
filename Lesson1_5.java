package com.ex.Algoritmic_2;

public class Lesson1_5 {
    public Lesson1_5(int [] array) {
        System.out.println("Результат 1_5: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

