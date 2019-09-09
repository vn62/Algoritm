package com.ex.Algoritmic_2;

public class Lesson3_8 {
    public static void main(String[] args) {
        new Lesson3_8();
    }

    public Lesson3_8() {
        int[] arrayP = {7, 2, 1};
        int[] arrayQ = {12, 3, 4};

        boolean hasChange = false;
        int countChange = 0;

        while(true){
            hasChange = false;
            for (int i = 0; i < arrayQ.length - 1; i++) {
                if(arrayP[i]*arrayQ[i+1] > arrayP[i+1]*arrayQ[i]) {
                    hasChange = true;
                    int temp = arrayP[i];
                    arrayP[i] = arrayP[i+1];
                    arrayP[i+1] = temp;
                    temp = arrayQ[i];
                    arrayQ[i] = arrayQ[i+1];
                    arrayQ[i+1] = temp;
                }
            }
            if(!hasChange) break;
        }

        System.out.println("Массивы упорядочены по возрастанию: ");
        for (int i = 0; i < arrayP.length; i++) {
            System.out.print(arrayP[i] + "/" + arrayQ[i] + " ");
        }


        System.out.println();
    }
}
