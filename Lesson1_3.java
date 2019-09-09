package com.ex.Algoritmic_2;

public class Lesson1_3 {
    public static void main(String[] args) {
        float[] array = {1,-2.2f,10.5f,-4,1,0,6.5f,3};

        new Lesson1_3(array);
    }

    public Lesson1_3(float [] array){
        int nul = 0;
        int pol = 0;
        int neg = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
               nul++;
            }
            else if(array[i] > 0) pol++;
            else neg++;
        }

        System.out.println("Количество нулей: " +  nul);
        System.out.println("Количество положительных: " +  pol);
        System.out.println("Количество отрицаткльных: " +  neg);

    }
}
