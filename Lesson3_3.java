package com.ex.Algoritmic_2;

public class Lesson3_3 {
    public static void main(String[] args) {
        new Lesson3_3();
    }

    public Lesson3_3() {
        int[] array = {3,2,6,7,9,10,1,4};

        int indexMax = 0;

        for (int i = 0; i < array.length; i++) {
            indexMax = i;
            for (int j = i; j < array.length; j++) {
                if(array[indexMax] < array[j]) {
                    indexMax = j;
                }
            }
            if(indexMax!=i){
                int temp = array[indexMax];
                array[indexMax] = array[i];
                array[i] = temp;
            }
        }

        System.out.println("Массив отсортированный выбором по убыванию: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }
}
