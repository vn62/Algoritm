package com.ex.Algoritmic_2;

public class Lesson1_7 {
    public Lesson1_7(float[] array){
        float maxSumm = 0;

        System.out.println("Результат 1_7: ");
        for (int i = 0; i < array.length; i++) {
            float temp = array[i] + array[array.length-i-1];
            if(temp>maxSumm)
             maxSumm = temp;
        }
        System.out.println("    Максимальная сумма чисел: " +  maxSumm);
    }
}
