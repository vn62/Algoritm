package com.ex.Algoritmic_2;

public class Lesson3_4 {
    public static void main(String[] args) {
        new Lesson3_4();
    }

    public Lesson3_4() {
        int[] array = {3,2,6,7,9,10,1,4};

        boolean hasChange = false;
        int countChange = 0;

        while(true){
            hasChange = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    hasChange = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    countChange++;
                }
            }

            if(!hasChange) break;
        }

        System.out.println("Массив отсортированный по возрастанию обменом за " + countChange + " перестановок: ");
        for (int j = 0; j < array.length; j++)
            System.out.print(array[j] + " ");

        System.out.println();
    }
}
