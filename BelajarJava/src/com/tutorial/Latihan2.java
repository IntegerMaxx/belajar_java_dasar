package com.tutorial;

import java.util.Arrays;

public class Latihan2 {
    public static void main(String[] args) {
        int[] array = {9,3,8,0,1,7,5,6,2,10,4};


        printAja("====SEBELUM====");
        printArray(array);


        printAja("====SESUDAH====");
        bubbleShort(array);
        printArray(array);

    }

    public static void bubbleShort(int[] dataArray){

        for (int i = 0; i < dataArray.length; i++){
            for (int j = 0; j < dataArray.length-1; j++){
                if (dataArray[j] > dataArray[j+1]) {
                    int buffer = dataArray[j];
                    dataArray[j] = dataArray[j+1];
                    dataArray[j+1] = buffer;
                }
            }
        }

    }

    public static void printArray(int[] dataArray){
        System.out.print("[");
        for (int i = 0; i < dataArray.length; i++){
            System.out.print(dataArray[i] + " , ");
        }
        System.out.print("]\n");
    }

    public static void printAja(String print){
        System.out.println(print);
    }
}
