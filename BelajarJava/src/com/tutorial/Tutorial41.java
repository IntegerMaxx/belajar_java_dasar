package com.tutorial;

import java.util.Arrays;



public class Tutorial41 {
    public static void main (String[] args){
        System.out.println("=====FAILD/GAGAL=====");
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};

        // looping standard
        System.out.println("Looping standard");
        for (int i=0; i < 10; i++ ){
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
        }
        // ini ini variabel i akan menyesuaikan dengan index yang ada di dalam array
        // array itu harus sesuai indexnya kalau tidak akan error "ArrayIndexOutOfBoundsException"

        // length itu untuk mengetahui JUMLAH NILAI yang ada di dalam array, BUKAN INDEXNYA
//        System.out.println(arrayAngka.length);
        // looping dengan property array
        System.out.println("looping dengan property length");
        for (int i=0; i < arrayAngka.length; i++){
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
        }

        // looping kshususon untuk collection <- array
        // pada looping ini "angka" akan secara otomatis masuk ke dalam array
        // dan menampikan semuanya perbaris tanpa menambahkan increment atau penjumlahan berulang
        System.out.println("looping for each");
        for (int angka : arrayAngka){
            System.out.println("angka pada looping ini = "+angka);
        }

    }

}
