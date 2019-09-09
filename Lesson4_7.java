package com.ex.Algoritmic_2;

public class Lesson4_7 {
    public static void main(String[] args) {
        Lesson4_7 lesson = new Lesson4_7();
        lesson.summaFatorialFromOneToNine();
    }

    public void summaFatorialFromOneToNine(){
        int summ = 0;
        for (int i = 1; i <= 9; i++) {
            if(i%2 != 0){
                summ = summ + findFatorial(i);
            }
        }
        System.out.println("Сумма факториалов нечетных чисел: " + summ);
    }

    public int findFatorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
