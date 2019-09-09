package com.ex.Algoritmic_2;

public class Lesson1_5 {

    public static void main(String[] args) {
        int[] array = {2,10,1,5,1,6,3};
        new Lesson1_5(array);
    }

    public Lesson1_5(int [] array) {
        System.out.println("Числа для которых ai>i");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

