package com.tutorial;

import java.util.Arrays;

public class tugasArray {
    public static void main(String[] args) {
        // Tugas -> sort terbalik menggunakan looping
        // operasi tambah antara dua buah array mengunakan copyOf sehingga kita bisa menghasilkan array baru dari penjumlahan dua buah array
        // menggabungngkan dua buah array menggunakan copyLooping lalu bikin fungsinya untuk nempelin dua buah array
        // sehingga jumlahnya sama dengan total komponen yang ada di dua buah array itu
        int[] arrayAngka = {1,2,3,4,5};
        int[] arrayAngka2 = {1,2,3,4,5};
        int[] arrayAngka3 = {56,62,100,30,40};
        int n = arrayAngka3.length;

        printArray(arrayAngka, arrayAngka2);

        System.out.println("===ini short===");
        System.out.println("sebelum");
        System.out.println(Arrays.toString(arrayAngka3));

        for (int i = 1; i < n; i++) {

            if (arrayAngka3[i - 1] > arrayAngka3[i]){
                int m = arrayAngka3[i - 1];
                arrayAngka3[i - 1] = arrayAngka3[i];
                arrayAngka3[i] = m;
                System.out.println(m);

            }

        }


    }

    public static void printArray(int[] arrayAngka, int[] arrayAngka2){
        System.out.println("Array = " + Arrays.toString(arrayAngka));
        System.out.println("Array = " + Arrays.toString(arrayAngka2));

    }
}
