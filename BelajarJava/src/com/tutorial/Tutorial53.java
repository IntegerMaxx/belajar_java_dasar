package com.tutorial;

import java.util.Scanner;

public class Tutorial53 {
    public static void main(String[] args) {

        int[] arrayData = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke-");
        int indexInput = userInput.nextInt();

        // Exception Biasa
        System.out.println("Exception Biasa");
        try {
            System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);
        } catch (Exception e){
            System.err.println(e);
        }

        // Exception didalam fungsi
        System.out.println("\nException dalam fungsi");
        int data = ambilDataDariArray(arrayData, indexInput);
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data);

        // Exception throws by method
        System.out.println("Exception throws by method");
        int data2 = 0;
        try{
            data2 = ambilData(arrayData, indexInput);
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data2);


        System.out.println("\n\nakhir dari program");


    }

    private static int ambilData(int[] array, int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }

    private static int ambilDataDariArray(int[] array,int index){
        int hasil = 0;

        try {
            hasil = array[index];
        } catch (Exception e){
            System.err.println(e);
        }

        return hasil;
    }
}
/*
PENJELASAN: jadi saat user menginputkan data, dia akan masuk ke indexInput
yang selanjutnya akan dilihat dan ditampilkan pada baris ke-15, ditampilkan
inputannya indexInput, kemudian dia juga akan mengakses index yang ada di dalam
variabel arrayData
*/

/*
PENJELASAN: jadi kita bisa membuat throws Exception di baris code
method utama atau di baris code method lainnya. Tapi kekurangannya
programnya akan error dengan kata lain programnya tidak akan jalan
sama sekali.
*/