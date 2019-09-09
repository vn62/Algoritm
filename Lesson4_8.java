package com.ex.Algoritmic_2;

public class Lesson4_8 {
    public static void main(String[] args) {
        Lesson4_8 lesson = new Lesson4_8();
        int[] array = {1,2,3,4,5,6,8,9};
        lesson.summaFromTo(array, 3);
    }

    public void summaFromTo(int[] array, int indexFrom){
        int summ = 0;
        int indexTo = indexFrom + 3;
        if(indexTo > array.length) indexTo = array.length;

        for (int i = indexFrom; i < indexTo; i++) {
            summ = summ + array[i];
        }

        System.out.println("Массив: ");
        for (int j = 0; j < array.length; j++)
            System.out.print(array[j] + " ");
        System.out.println();
        System.out.println("Сумма 3 элементов начиная с " + indexFrom + ": " + summ);
    }
}
