package com.ex.Algoritmic_2;

public class Lesson1_4 {
    public static void main(String[] args) {
        float[] array = {1,-2.2f,10.5f,-4,1,0,6.5f,3};
        new Lesson1_4(array);
    }

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

        System.out.println("Поменять в массиве местами наибольший и наименьший эллемент");
        System.out.println("Изменены  элементы с индексом " + indexMax + " и " + indexMin);
        for (float a: array) System.out.print(a + " ");
        System.out.println();
    }
}
