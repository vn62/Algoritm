package com.ex.Algoritmic_2;

public class Lesson3_6 {
    public static void main(String[] args) {
        new Lesson3_6();
    }

    public Lesson3_6() {
        int[] array = {7,2,5,4,6,1};

        int i = 0;

        while(true){
            if(array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if(i !=0) i--;
            } else {
                i++;
                if(i == array.length - 1) break;
            }
        }


        System.out.println("Массив отсортированный по возрастанию методом Шелла: ");
        for (int j = 0; j < array.length; j++)
            System.out.print(array[j] + " ");

        System.out.println();
    }
}
