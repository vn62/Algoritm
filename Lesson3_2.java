package com.ex.Algoritmic_2;

public class Lesson3_2 {
    public static void main(String[] args) {
        new Lesson3_2();
    }

    public Lesson3_2() {
        int[] arrayA = {1, 3, 6, 8, 12,15,16,18,22,30,35,38,60,66,67,87,98};
        int[] arrayB = {2, 4, 5, 7, 10,11,12,18,32,35,40};

        int indexA = 0;
        int indexB = 0;


        while(true) {
            if(arrayA[indexA] <= arrayB[indexB]) {
               indexA++;
            }
            else{
                for (int i = arrayA.length - 1; i != indexA; i--) {
                    arrayA[i] = arrayA[i-1];
                }
                arrayA[indexA] = arrayB[indexB];

                for (int i = 0; i < arrayA.length; i++)
                    System.out.print(arrayA[i] + " ");
                System.out.println();

                indexA = indexA + 1;
                indexB++;
            }

            if(indexA == arrayA.length)  break;
        }

        System.out.println("Объединенный массив: ");
        for (int i = 0; i < arrayA.length; i++)
            System.out.print(arrayA[i] + " ");

        System.out.println();
    }
}
