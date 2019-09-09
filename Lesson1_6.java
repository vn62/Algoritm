package com.ex.Algoritmic_2;

public class Lesson1_6 {
    public static void main(String[] args) {
        float[] array = {1,2,3.2f,4,5,6,7,8};
        new Lesson1_6(array);
    }

    public Lesson1_6(float[] array){
        float summ = 0;

        for (int i = 2; i < array.length; i++) {
            boolean isSimple = true;
            for (int j = 2; j < array.length; j++){
                if(i%j == 0 && i != j) {
                    isSimple = false;
                }
            }
            if(isSimple == true) {
                summ = summ + array[i];
            }
        }
        System.out.println("Сумма чисел, номера которых простые числа: " +  summ);
    }
}
