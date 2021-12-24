package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5(5, 8);
    }

    public static void task1(){
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }

    public static void task2(){
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    public static void task3(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] *= 2;
            }
            System.out.println(array[i]);
        }
    }

    public static void task4(){
        int[][] array = new int[5][5];
        for(int i = 0; i < array.length; i++){
            for(int x = 0; x < array.length; x++){
                array[i][i] = 1;
                System.out.print(array[i][x] + "  ");
            }
            System.out.println();
        }
    }

    public static int[] task5(int len, int initialValue){
        int[] array = new int[len];
        for(int i = 0; i < array.length; i++){
            array[i] = initialValue;
            System.out.println(array[i]);
        }
        return array;
    }
}