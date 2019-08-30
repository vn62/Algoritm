package com.ex.Algoritmic_2;

public class Lesson1_10 {
    public Lesson1_10(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(2*i<array.length )
                array[i] = array[2*i];
            else array[i] = 0;
        }

        System.out.println("    Результат 1_10: ");
        System.out.println("    Сжатый массив: ");
        for (int o: array) System.out.print(o + " ");
    }
}
