package com.ex.Algoritmic_2;

public class Lesson1_9 {
    public Lesson1_9(int[] array) {
        int number = array[0];
        int nextNumber = array[0];
        int countOfNumber = 0;
        int nextCountOfNumber = 0;
        boolean isFind = false;


        for (int i = 0; i < array.length; i++) {
            number = array[i];
            countOfNumber = 0;
            for (int j = 0; j < array.length; j++) {
                if(number == array[j])
                    countOfNumber++;
            }

            if(countOfNumber > 1) {
                if (countOfNumber > nextCountOfNumber) {
                    isFind = true;
                    nextNumber = number;
                    nextCountOfNumber = countOfNumber;
                } else {
                    if (countOfNumber == nextCountOfNumber) {
                        if (nextNumber > number) nextNumber = number;
                    }
                }
            }
        }

        System.out.println("    Результат 1_9: ");

        if(isFind) System.out.println("    Минимальное из часто встречающихся чисел " + nextNumber
                + " повторяется " + nextCountOfNumber + " раз(а)");
        else   System.out.println("    Числа не повторяются");

    }
}
