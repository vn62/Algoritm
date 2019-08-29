package com.ex.Algoritmic_2;

class Lesson1_1 {
    public Lesson1_1(int [] array, int k){
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%k == 0) summ = summ + array[i];
        }
        for (int a: array) System.out.print(a + "   ");
        System.out.println();
        System.out.println("Результат 1_1: " + summ);
    }
}
