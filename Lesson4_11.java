package com.ex.Algoritmic_2;

public class Lesson4_11 {
    public static void main(String[] args) {
        int number1 = 11;
        int number2 = 111;
        int sizeNums1 = getSizeArray(number1);
        int sizeNums2 = getSizeArray(number2);

        if(sizeNums1 == sizeNums2) {
            System.out.println("Одинаковое количество цифр у обоих чисел");
        } else if (sizeNums1 > sizeNums2) {
            System.out.println("Число " + number1 + " имеет больше цифр");
        } else
            System.out.println("Число " + number2 + " имеет больше цифр");
    }

    public static int getSizeArray(int number){
        int sizeArray = 0;
        while(number!=0){
            number = number/10;
            sizeArray++;
        }
        return sizeArray;
    }



}
