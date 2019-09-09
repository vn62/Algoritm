package com.ex.Algoritmic_2;

public class Lesson4_10 {
    public static void main(String[] args) {
        Lesson4_10 lesson = new Lesson4_10();
        int number = 116048;
        System.out.println("Число " + number + " состоит из: ");
        printArray(lesson.getNumbers(number));
    }

    public int[] getNumbers(int number){
        int sizeArray = getSizeArray(number);
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = number%10;
            number = number/10;
        }
        return array;
    }

    public static int getSizeArray(int number){
        int sizeArray = 0;
        while(number!=0){
            number = number/10;
            sizeArray++;
        }
        return sizeArray;
    }


    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
