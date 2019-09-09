package com.ex.Algoritmic_2;

public class Lesson4_9 {
    public static void main(String[] args) {
        Lesson4_9 lesson = new Lesson4_9();
        double x = 10;
        double y = 5;
        double z = 10;
        double t = 5;
        System.out.println("Площадь четырехугольника: " + lesson.getAreaRectangle(x, y, z, t));
    }

    public double getAreaRectangle(double x, double y, double z, double t){
        double diagonal = getDiagonal(x,y);
        double halfPerimeterSecond = 0.5 * getPerimetrTreangle(diagonal,z,t);
        double areaSecondTreangle = Math.sqrt(halfPerimeterSecond
                *(halfPerimeterSecond - diagonal)
                *(halfPerimeterSecond - z)
                *(halfPerimeterSecond - t));
        return getAreaRightTreangle(x,y) + areaSecondTreangle;
    }

    public double getAreaRightTreangle(double x, double y){
        return 0.5*x*y;
    }

    public double getPerimetrTreangle(double x, double y, double z){
        return x+y+z;
    }

    public double getDiagonal(double x, double y){
        return Math.sqrt(Math.pow(x,2)+ Math.pow(y,2));
    }
}
