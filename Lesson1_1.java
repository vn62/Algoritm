package com.ex.Algoritmic_2;

class Lesson1_1 {
    public static void main(String[] args) {
        int[] array = {2,10,1,5,1,6,3};
        new Lesson1_1( array , 2);
    }

    public Lesson1_1(int [] array, int k){
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%k == 0) summ = summ + array[i];
        }

        System.out.println("Массив А: ");
        for (int a: array) System.out.print(a + "   ");
        System.out.println();

        System.out.println("Сумма элементов кратных " + k + " равна " + summ);
    }
}
