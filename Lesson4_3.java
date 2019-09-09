package com.ex.Algoritmic_2;

import java.util.Scanner;

public class Lesson4_3 {
    public static void main(String[] args) {
        Lesson4_3 lesson = new Lesson4_3();
        lesson.reciveArea();
    }

    public void reciveArea(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите длину стороны шестиугольника: ");
        if(scan.hasNextDouble()) {
            double storonaA = scan.nextDouble();
            scan.close();
            double area = 6 * Math.pow(storonaA, 2) * Math.sqrt(3) / 4;
            System.out.println("Площадь шестиугольник со стороной " + storonaA + " : " + area);
        }
    }
}
