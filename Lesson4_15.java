package com.ex.Algoritmic_2;

public class Lesson4_15 {
    public static void main(String[] args) {
        int number = 5;
        Lesson4_15 lesson = new Lesson4_15();
        System.out.println("Все " + number + "-х значныеные числа в которых числа образуют возратающую последовательность: ");
        lesson.checkRicing(number);
    }

    public void checkRicing(int number){
        for (int i = (int) Math.pow(10,number-1); i < Math.pow(10,number); i++) {
            if(chechIsRising(i)) System.out.println(i);
        }
    }

    public boolean chechIsRising(int number){
        int[] array = createArray(number);
        boolean isRising = true;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] != (array[i+1]+1)){
                isRising = false;
                break;
            }
        }
        return isRising;
    }


    public int[] createArray(int number){
        int sizeOfNumber = checkSizeNumber(number);
        int[] array = new int[sizeOfNumber];

        int temp = number;
        int i = 0;
        while(temp!=0){
            array[i] = temp%10;
            temp = temp/10;
            i++;
        }
        return array;
    }

    public int checkSizeNumber(int number){
        int size = 0;
        while(number!=0){
            number = number/10;
            size++;
        }
        return size;
    }
}
