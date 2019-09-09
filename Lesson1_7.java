package com.ex.Algoritmic_2;

public class Lesson1_7 {
    public static void main(String[] args) {
        float[] array = {1,10,3,4,5,6,7,8};
        new Lesson1_7(array);
    }

    public Lesson1_7(float[] array){
        float maxSumm = 0;

        for (int i = 0; i < array.length; i++) {
            float temp = array[i] + array[array.length-i-1];
            if(temp>maxSumm)
             maxSumm = temp;
        }
        System.out.println("Максимальная сумма чисел: " +  maxSumm);
    }
}
