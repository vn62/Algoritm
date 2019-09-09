package com.ex.Algoritmic_2;

public class Lesson4_2 {
    public static void main(String[] args) {
        int[] array = {8,12,16,28};
        Lesson4_2 lesson = new Lesson4_2();
        System.out.println("Задан массив 4 наутральных чисел: ");
        lesson.printArray(array);
        System.out.println("Наибольший общий делитель массива: " + lesson.findArrayNOD(array));
    }

    public int findArrayNOD(int[] array) {
        int valueOfArrayNOD = 1;
        int number = array[findIndexOfMin(array)];

        while(true){
            boolean hasDevide = false;
            for (int j = 0; j < array.length; j++) {
                if(array[j]%number == 0) {
                    hasDevide = true;
                } else {
                    hasDevide = false;
                    break;
                }
            }
            if(hasDevide) {
                valueOfArrayNOD = valueOfArrayNOD * number;
                for (int j = 0; j < array.length; j++) {
                    array[j] = array[j]/number;
                }
            } else number--;

            if(number == 1) break;
        }
        return valueOfArrayNOD;
    }

    public void printArray(int[] array){
        for(int o: array) System.out.print(o + " ");
        System.out.println();
    }

    public int findIndexOfMin(int [] array){
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[indexOfMin]) indexOfMin = i;
        }
        return indexOfMin;
    }
}
