package com.ex.Algoritmic_2;

public class Lesson3_5___ {
    public static void main(String[] args) {
        new Lesson3_5___();
    }

    public Lesson3_5___() {
        int[] array = {3,2,6,7,9,10,1,4};
        int index = 0;

        for (int i = 1; i < array.length - 1; i++) {
            index = doubleSearchIndexForPaste(array, array[i + 1]);
            if(index > 0){
                int temp = array[index];
            }
        }


        System.out.println("Массив отсортированный по возрастанию вставками: ");
        for (int j = 0; j < array.length; j++)
            System.out.print(array[j] + " ");

        System.out.println();
    }

    public int doubleSearchIndexForPaste(int[] array, int elementOfArray){
        int indexPaste = -1;
        if (array != null) {
            int start = 0;
            int stop = array.length;
            int midle;
            while (start < stop) {
                midle = (0 + array.length) >>> 1;
                if (elementOfArray == array[midle]) {
                    indexPaste = midle;
                    break;
                } else {
                    if (elementOfArray < array[midle]) {
                        stop = indexPaste;
                    } else {
                        start = midle + 1;
                    }
                }
            }
        }
        return indexPaste;
    }
}