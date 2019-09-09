package com.ex.Algoritmic_2;

import java.util.Scanner;

public class Lesson4_5 {
    public static void main(String[] args) {
        Lesson4_5 lesson = new Lesson4_5();
        double[] array = lesson.inputArray();
        lesson.findSecondMax(array);
    }

    public void findSecondMax(double[] array) {
        double secondMaxElement = 0;
        double MaxElement = findMax(array);
        for (int i = 0; i < array.length; i++) {
             if(array[i] > secondMaxElement && array[i] != MaxElement) secondMaxElement = array[i];
        }
        System.out.println("Первый максимум: " + MaxElement);
        System.out.println("Второй максимум: " + secondMaxElement);
    }

    public double findMax(double[] array){
        double maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxElement) maxElement = array[i];
        }
        return maxElement;
    }

    public double[] inputArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int number = scan.nextInt();

        System.out.println("Введите " + number + " элементов массива: ");
        double[] array = new double[number];
        for (int i = 0; i < number; i++) {
            array[i] = scan.nextDouble();
        }
        return array;
    }
}