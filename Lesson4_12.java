package com.ex.Algoritmic_2;

import java.util.Arrays;

public class Lesson4_12 {
    public static void main(String[] args) {
        int number = 10;
        int numberN = 500;
        Lesson4_12 lesson = new Lesson4_12();
        System.out.println("Массив числел, сумма элементов которых равны " + number +": ");
        lesson.searchArrayOfNumber(number, numberN);
    }

    public void searchArrayOfNumber(int number, int numberN){
        int[] array = new int[10];
        int sizeArrays = 0;
        int i = 0;

        while (true){
            int summaNumbers = getNumbersSumm(i);
            if(summaNumbers == number) {
                array[sizeArrays] = i;
                sizeArrays++;
                if (sizeArrays >= array.length) array = extendsArray(array);
            }
            i++;
            if(i >= numberN) break;
        }

        printArray(outputArray(array, sizeArrays));
    }

    public int[] extendsArray(int[] array) {
        int[] newArray = new int[2*array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public int[] outputArray(int[] array, int sizeArray) {
        int[] newArray = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int getNumbersSumm(int number){
        int summ = 0;
        while(number!=0){
            summ = summ + number%10;
            number = number/10;
        }
        return summ;
    }
}
