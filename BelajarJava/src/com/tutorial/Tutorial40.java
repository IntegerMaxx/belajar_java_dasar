package com.tutorial;

import java.util.Arrays;

public class Tutorial40 {
    public static void main (String[] args){
        // assignment
        // tipeData [] nama ={Komponen-komponen}
        System.out.println("Assignment Array");
        //            index =  0 1 2 3
        //                     | | | |
        int [] arrayInteger = {1,2,3,4};

        arrayInteger[0] = 10;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        // Deklarasi
        // tipedata[] nama = new int[jumlahArray];

        // jika deklarasi array otomatis isinya kosong, kita harus mengisinya terlebih dahulu
        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[6];

        arrayFloat[5] = 11.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);
        System.out.println(arrayFloat[5]);

        // untuk mengurutkan nilai array menjadi sebaris, tapi sudah dalam bentuk string
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));
    }
}
