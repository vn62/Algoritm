package com.ex.Algoritmic_2;

public class Lesson1_2 {
    public Lesson1_2(float [] array, int k){
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > k){
                array[i] = k;
                summ++;
            }
        }
        System.out.println("    Результат 1_2: ");
        for (float a: array) System.out.print(a + " ");
        System.out.println();
        System.out.println("    Количество замен: " +  summ);
    }
}
