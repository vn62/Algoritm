package com.ex.Algoritmic_2;

public class Lesson1_7 {
    public Lesson1_7(float[] array){
        float summ = 0;

        System.out.println("Результат 1_6: ");      //{1,2,3,4,5,6,7,8};
        //{0,1,2,3,4,5,6,7};
        for (int i = 2; i < array.length; i++) {
            boolean isSimple = true;
            for (int j = 2; j < array.length; j++){
                if(i%j == 0 && i != j) {
                    isSimple = false;
                }
            }
            if(isSimple == true) {
                //System.out.print(i + " ");
                summ = summ + array[i];
            }
        }
        System.out.println("    Сумма чисел, номера которых простые числа: " +  summ);
    }
}
