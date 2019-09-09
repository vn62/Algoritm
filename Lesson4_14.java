package com.ex.Algoritmic_2;

public class Lesson4_14 {
    public static void main(String[] args) {
        int indexTo = 10000;
        Lesson4_14 lesson = new Lesson4_14();
        System.out.println("Числа Армстронга до " + indexTo + ": ");
        lesson.seachArmstrongNumber(indexTo);
    }

    public void seachArmstrongNumber(int indexTo){
        for (int i = 1; i < indexTo; i++) {
            if(checkArmstrongNumber(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public int checkSizeNumber(int number){
        int size = 0;
        while(number!=0){
            number = number/10;
            size++;
        }
        return size;
    }

    public  boolean checkArmstrongNumber(int number){
        int size = checkSizeNumber(number);
        int summ = 0;

        int temp = number;
        while(temp!=0){
            summ = summ + (int)Math.pow(temp%10, size);
            temp = temp/10;
        }

        return summ == number;
    }
}
