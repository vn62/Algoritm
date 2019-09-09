package com.ex.Algoritmic_2;

public class Lesson4_17 {
    private int count = 0;

    public void incrementCount() {
        count++;
    }

    public void resetCount() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Lesson4_17 lesson = new Lesson4_17();
        int number = 123;
        lesson.checkCount(number);

        System.out.println("Для числа " + number + " потребуется " + lesson.getCount() + " итераций ");
    }

    public void checkCount(int number){
        resetCount();
        while(number!=0){
            number = number - summOfElements(number);
            incrementCount();
        }
    }

    public int summOfElements(int number){
        int[] array = createArrayOfElements(number);
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
           summ = summ + array[i];
        }
        return summ;
    }

    public int[] createArrayOfElements(long number){
        int[] array = new int[checkSizeNumberArray(number)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)number%10;
            number = number/10;
        }
        return array;
    }

    public int checkSizeNumberArray(long number){
        int size = 0;
        while(number!=0){
            number = number/10;
            size++;
        }
        return size;
    }
}
