package com.ex.Algoritmic_2;

public class Lesson2_9 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{8,7,6,5},{15,10,11,12}, {15,10,11,12}};
        new Lesson2_9(array);
    }
    public Lesson2_9(int[][] array) {
        Algoritm.showArray(array);
        int sizeRow = array.length;
        int sizeCol = array[0].length;

        int summ = 0;
        int maxSumm = 0;
        int index = 0;

        System.out.println("Cуммы элементов столбца: ");
        for (int i = 0; i < sizeCol; i++) {
            summ = 0;
            for (int j = 0; j < sizeRow; j++) {
                summ = summ + array[j][i];
                if (summ > maxSumm) {
                    maxSumm = summ;
                    index = i + 1;
                }
            }
            System.out.println("Ст " + (i + 1) + ": " + summ);
        }

        System.out.println("Столбец " + index + " содержит максимальную сумму: " + maxSumm);
        System.out.println();
    }
}
