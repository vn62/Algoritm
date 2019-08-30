package com.ex.Algoritmic_2;

public class Lesson1_4 {
    public Lesson1_4(float [] array){
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>array[indexMax]) indexMax = i;
            if(array[i]<array[indexMin]) indexMin = i;
        }

        float temp = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = temp;

        System.out.println("Результат 1_4: ");
        System.out.println("    В массиве изменены  элементы с индексом " + indexMax + " и " + indexMin);
        for (float a: array) System.out.print(a + " ");
        System.out.println();
    }
}
