package com.ex.Algoritmic_2;

public class Lesson4_1 {
    public static void main(String[] args) {
        System.out.println("Наибольший общий делитель: " + findNOD(24,15));
        System.out.println("Наименьшее общее кратное: " + findNOK(24,15));
    }

    public static int findNOD(int numberA, int numberB) {
        while (numberB != 0) {
            int temp = numberA % numberB;
            numberA = numberB;
            numberB = temp;
        }
        return numberA;
    }

    public static int findNOK(int numberA, int numberB) {
        return numberA*numberB/findNOD(numberA, numberB);
    }
}
