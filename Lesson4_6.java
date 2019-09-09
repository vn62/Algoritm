package com.ex.Algoritmic_2;

public class Lesson4_6 {
    public static void main(String[] args) {
        Lesson4_6 lesson = new Lesson4_6();
        lesson.checkSimple(3,5,7);
    }

    public void checkSimple(int A, int B, int C) {
        Lesson4_1 lesson = new Lesson4_1();
        System.out.print("A = " + A + " B = " + B + " C = " + C + " ");
        if(lesson.findNOD(A,B) == 1 && lesson.findNOD(B,C) == 1 && lesson.findNOD(A,C) == 1){
            System.out.println(" взаимно простые числа");
        } else System.out.println(" не взаимно простые числа");
    }
}
