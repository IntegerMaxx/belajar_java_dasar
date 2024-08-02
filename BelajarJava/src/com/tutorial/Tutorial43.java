package com.tutorial;

import java.util.Arrays;

public class Tutorial43 {
    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5};

        // merubah array menjadi string
        System.out.println("\nMerubah array menjadi string\n===============");
        printArray(arrayAngka1);

        // mengcopy array
        System.out.println("\nmengcopy array\n===============");
        int[] arrayAngka2 = new int[5]; // >> ini sebenarnya nilai integernya bukan index. Karena dia memiliki nilai
        printArray(arrayAngka1);        // maka yang diikuti adalah nilai integer
        printArray(arrayAngka2);

        System.out.println("\nmengcopy dengan loop");
        for (int i = 0; i < arrayAngka1.length; i++ ){
            arrayAngka2[i] = arrayAngka1[i];
        } // indexnya yang dibaca
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);


        System.out.println("\nmengcopy dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3); // indexnya yang dibaca
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\nmengcopy dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2,5); // indexnya yang dibaca >> batas atas
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);

        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\nfill array\n===============");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 5);
        printArray(arrayAngka5);

        // komparasi array
        System.out.println("\nkomparasi array\n===============");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,10};

        System.out.println("\nmembandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));

        if (Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini beda");
        }

        System.out.println("\nmengecek mana array yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));

        System.out.println("\nngecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7)); // yang dibaca memang bener index
                                                                        // index yang dluan ketemu itulah yang dibaca

        // sort array
        System.out.println("\nsort array\n===============");
        int[] arrayAngka8 = {1,6,4,5,3,5,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);


        // search array
        System.out.println("\nsearch array\n===============");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("angka "+ angka +" ada di index " + posisi);

        // Tugas -> sort terbalik menggunakan looping
        // operasi tambah antara dua buah array mengunakan copyOf sehingga kita bisa menghasilkan array baru dari penjumlahan dua buah array
        // menggabungngkan dua buah array menggunakan copyLooping lalu bikin fungsinya untuk nempelin dua buah array
           // sehingga jumlahnya sama dengan total komponen yang ada di dua buah array itu

        int[] arrayAngka10 = {1,2,3};
        int[] arrayAngka20 = {1,3};
        int angka10 = Arrays.compare(arrayAngka10, arrayAngka20);

        if (angka10 == 1) {
            System.out.println("arrayAngka10 lebih besar dari arrayAngka20");
        } if (angka10 == -1 ){
            System.out.println("arrayAngka10 lebih kecil dari arrayAngka20");
        } if (angka10 == 0 ) {
            System.out.println("arrayAngka10 sama dengan arrayAngka20");
        }




    }

    private static void printArray (int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));

    }

}
