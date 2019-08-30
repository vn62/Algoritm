package com.ex.Algoritmic_2;

public class Lesson1_8 {
    public Lesson1_8(int[] array){
        int min = array[0];
        int numOfMin = 0;

        System.out.println("Результат 1_8: ");

        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) numOfMin++;
        }

        System.out.println("    Минимальное число: " + min + " количество: " + numOfMin);

        int newSize = array.length - numOfMin;
        int[] newArray = new int[newSize];
        int index = 0;

        for (int i = 0; i < newSize; i++) {
            if(array[index + i] == min)
                index++;
            newArray[i] = array[index + i];
        }
        //{2,10,1,5,1,6,3};

        for (int i: newArray) System.out.print(i + " ");
        System.out.println();
    }
}

