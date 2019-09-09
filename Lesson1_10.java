package com.ex.Algoritmic_2;

public class Lesson1_10 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,12,12};
        new Lesson1_10(array);
    }
    public Lesson1_10(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(2*i<array.length )
                array[i] = array[2*i];
            else array[i] = 0;
        }

        System.out.println("Сжатый массив: ");
        for (int o: array) System.out.print(o + " ");
    }
}
