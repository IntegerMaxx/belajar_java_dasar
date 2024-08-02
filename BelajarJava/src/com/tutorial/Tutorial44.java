package com.tutorial;

import java.util.Arrays;

public class Tutorial44 {
    public static void main(String[] args) {

        int[] arrayAngka1 = {2,3,5,1,12,7,60,6,8,9};
        int[] arrayAngka2 = {0,4,3,2,1,5,9,8,7,4};

        // penjumlahan antara dua buah array
        System.out.println("==========PENJUMLAHAN ANTARA DUA BUAH ARRAY==========");
        int[] arrayHasil1 = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
//         printArray(tambahArray(arrayAngka1, arrayAngka2), "hasil");
        printArray(arrayHasil1, "hasil 1"); // angka 13 darimana?? = dari 9 + 4
        System.out.println("=====================PEMISAH=====================");


        // Menggabungkan dua buah array
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];

        for(int i = 0; i < arrayAngka1.length; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }

        for(int i = 0; i < arrayAngka2.length; i++) {
             arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }
        System.out.println("==========PENGGABUNGAN DUA BUAH ARRAY==========");
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil2, "hasil 2");
        System.out.println("=====================PEMISAH=====================");

        // Sorting reverse, mengurutkan tapi kebalik
        System.out.println("==========ARRAY SORTING TERBALIK==========");
        printArray(arrayAngka1, "array 1");
        reverse(arrayAngka1);
        printArray(arrayAngka1, "reverse 1");

        printArray(arrayAngka2, "array 2");
        reverse2(arrayAngka2);
        printArray(arrayAngka2, "reverse 2");

//        int[] test ={40,80,12,88,99,2,11,8,5,3};
        int[] test2 ={40,80,12,88,99,0,0,0,0,0};
        reverse2(test2);
        printArray(test2, "pembuktian");
//        Arrays.sort(test);
//        printArray(test, "test");


    }

    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray); // ini pertama {2, 3, 5, 8, 11, 12, 40, 80, 88, 99}
        int buffer;

        for (int i = 0; i < dataArray.length/2; i++){ // {2, 3, 5, 8, 11} {12, 40, 80, 88, 99}
            buffer = dataArray[i]; // indeksnya hanya 5
            dataArray[i] = dataArray[(dataArray.length - 1) - i ]; // {99,88,80,40,12}
            dataArray[(dataArray.length - 1) - i ] = buffer;// berarti dia mengambil data yang baru
            // jadi hasilnya {11,8,5,3,2}. karna dibatasi 5 berarti dia berlanjut hingga ke buffer
        }
    }

    public static void reverse(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
        for (int i = 0; i < dataArray.length; i++){
            dataArray[i]= arrayBuffer[(dataArray.length- 1) - i];
        }

    }

    private static int[] tambahArray (int[] arrayInt1, int[] arrayInt2){

        int[] arrayHasil = new int[arrayInt1.length];
        for(int i = 0; i < arrayInt1.length; i++){
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }




    private static void printArray(int[] dataArray, String messege ){
        System.out.println(messege + " = " + Arrays.toString(dataArray));
    }


}
