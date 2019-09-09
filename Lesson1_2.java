package com.ex.Algoritmic_2;

public class Lesson1_2 {
    public static void main(String[] args) {
        float[] array = {1,-2.2f,10.5f,-4,1,0,6.5f,3};
        new Lesson1_2(array , 7);
    }

    public Lesson1_2(float [] array, int k){
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > k){
                array[i] = k;
                summ++;
            }
        }
        System.out.println("Массив после замены всех элементов больше " + k + " на " + k + ": ");
        for (float a: array) System.out.print(a + " ");
        System.out.println();
        System.out.println("Количество замен: " +  summ);
    }
}
