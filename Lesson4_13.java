package com.ex.Algoritmic_2;

public class Lesson4_13 {
    public static void main(String[] args) {
        int number = 10;
        Lesson4_13 lesson = new Lesson4_13();
        lesson.seachTwin(number);
    }

    public void seachTwin(int number) {
        int indexTo = 2 * number;
        System.out.println("Числа блезнецы от " + number + " до " + indexTo + ": ");
        for (int i = number; i < indexTo; i++) {
            if ((i + 2) > indexTo) break;
            printTwin(i);
        }
    }

    public void printTwin(int number){
        System.out.println(number + " - " + (number + 2));
    }
}
