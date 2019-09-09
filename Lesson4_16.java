package com.ex.Algoritmic_2;

public class Lesson4_16 {
    private int countOdds = 0;
    private long summOdds = 0;
    private int sizeOfNumber = 3;

    public void setSizeOfNumber(int sizeOfNumber){
        this.sizeOfNumber = sizeOfNumber;
    }

    public void addSummOdds(int number){
        summOdds = summOdds + number;
    }

    public long getSummOdds(){
        return summOdds;
    }

    public void incrementCount() {
        countOdds++;
    }

    public void resetCount() {
        countOdds = 0;
    }

    public int getCountOdds(){
        return countOdds;
    }

    public static void main(String[] args) {
        Lesson4_16 lesson = new Lesson4_16();
        lesson.setSizeOfNumber(3);
        lesson.checkSummOdd(lesson.sizeOfNumber);
        lesson.checkCountOdd(lesson.getSummOdds());
        System.out.println("Сумма : " + lesson.getSummOdds() + ". Количество четных чисел: "
                + lesson.getCountOdds());
    }

    public void checkSummOdd(int sizeOfNumber){
        for (int i = (int) Math.pow(10,sizeOfNumber-1); i < Math.pow(10,sizeOfNumber); i++) {
            if(checkEvenOfElements(i)) addSummOdds(i);
        }
    }

    public void checkCountOdd(long number) {
        int[] array = createArrayOfElements(number);
        resetCount();
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0) incrementCount();
        }
    }

    public boolean checkEvenOfElements(long number){
        int[] array = createArrayOfElements(number);
        boolean isOdd = true;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0) {
                isOdd = false;
                break;
            }
        }
        return isOdd;
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
