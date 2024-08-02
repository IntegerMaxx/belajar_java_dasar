package com.tutorial;

import java.util.Scanner;

public class Tutorial30 {
    public static void main(String [] args){

        // program untuk menjumlahkan angka dengan rentang
        System.out.println("====WHILE====");
        int nilaiAwal, nilaiAkhir, total;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukkan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();
        total = 0;

        while (nilaiAwal <= nilaiAkhir ){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
        System.out.println("===AKHIR WHILE====");

        System.out.println("--------------------------");

        System.out.println("====AWAL DO WHILE====");
        int nilaiAwal1, nilaiAkhir1, total1;
        Scanner inputUser1 = new Scanner(System.in);
        System.out.print("masukkan nilai awal = ");
        nilaiAwal1 = inputUser1.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir1 = inputUser1.nextInt();
        total1 = 0;

        do {
            total1 = total1 + nilaiAwal1;
            System.out.println("ditambah " + nilaiAwal1 + " menjadi " + total1);
            nilaiAwal1++;
        }while (nilaiAwal1 <= nilaiAkhir1);
        System.out.println("====AKHIR DO WHILE====");

        System.out.println("--------------------------");

        System.out.println("====AWAL FOR LOOP====");
        int nilaiAwal2, nilaiAkhir2, total2;
        Scanner inputUser2 = new Scanner(System.in);
        System.out.print("masukkan nilai awal = ");
        nilaiAwal2 = inputUser2.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir2 = inputUser2.nextInt();
        total2 = 0;

        for (;nilaiAwal2 <= nilaiAkhir2;nilaiAwal2++){
            total2 = total2 + nilaiAwal2;
            System.out.println("ditambah " + nilaiAwal2 + " menjadi " + total2);
        }
        System.out.println("====AKHIR FOR LOOP=====");

    }
}
