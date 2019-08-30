package com.ex.Algoritmic_2;

public class Lesson2_9 {
    public Lesson2_9(int[][] array) {
        Algoritm.showArray(array);
        int sizeRow = array.length;
        int sizeCol = array[0].length;
        System.out.println("    Строк " + sizeRow + " столбцов " + sizeCol);

        int summ = 0;
        int maxSumm = 0;
        int index = 0;

        System.out.println("    Результат 2_9: ");
        System.out.println("    Cуммы элементов столбца: ");
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

        System.out.println("    Столбец " + index + " содержит максимальную сумму: " + maxSumm);
        System.out.println();
    }
}
