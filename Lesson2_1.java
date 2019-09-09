package com.ex.Algoritmic_2;

public class Lesson2_1 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{8,7,6,5},{15,10,11,12}, {15,10,11,12}};
        new Lesson2_1(array);
    }
    public Lesson2_1(int[][] array){
        Algoritm.showArray(array);
        
        int sizeRow = array.length;

        System.out.println("Все нечетные строки у которой первый элемент больше последнего: ");
        for (int i = 0; i < sizeRow; i++) {
            if(i%2 == 0){
                if(array[i][0] > array[i][array[i].length-1]) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
