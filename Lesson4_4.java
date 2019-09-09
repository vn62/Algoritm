package com.ex.Algoritmic_2;

import java.util.Scanner;

public class Lesson4_4{
    public static void main(String[] args) {
        Lesson4_4 lesson = new Lesson4_4();
        lesson.findDistance();
    }

    public void findDistance(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите количество точек:");
        int number = scan.nextInt();

        double[] arrayX = new double[number];
        double[] arrayY = new double[number];
        for (int i = 0; i < number; i++) {
            if(i == 2) System.out.println("Введите координаты " + (i + 1) + "-ей точки через пробел (x y): ");
            else  System.out.println("Введите координаты " + (i + 1) + "-ой точки через пробел (x y): ");

            arrayX[i] = scan.nextDouble();
            arrayY[i] = scan.nextDouble();
        }

        double maxDistance = 0;
        double tempDistance = 0;
        int indexFrom = 0;
        int indexTo = 1;
        for (int i = 0; i < arrayX.length - 1; i++) {
            for (int j = i + 1; j < arrayX.length; j++) {
                tempDistance = measureDistance(arrayX[i], arrayY[i], arrayX[j], arrayY[j]);
                if(tempDistance > maxDistance){
                    maxDistance = tempDistance;
                    indexFrom = i + 1;
                    indexTo = j + 1;
                }
            }
        }
        System.out.println("Максиммальное расстояние между " + indexFrom + " и " + indexTo + " точками, равно: " + maxDistance);
    }

    public static double measureDistance(double x1, double y1, double x2, double y2){
        return  Math.sqrt(Math.pow(Math.abs(x2-x1), 2) + Math.pow(Math.abs(y2-y1), 2));
    }
}

