package com.tutorial;
import java.util.Scanner;
public class test2 {
    public static void main (String[] args){
        int nilaiAwal, nilaiAkhir, total;
        Scanner userInput;
        userInput = new Scanner(System.in);

//       Maksudnya adalah saya ingin membuat program looping yang sekali di imputkan
//       bisa langsung mengeksekusi 3 metode looping while, do while, dan for
//       dan tatap bertahan dengan nilai antara rentang 1 sampai 10

        System.out.println("SELAMAT DATANG DI LOOPING SEDERHANA");
        System.out.println("SILAHKAN MASUKKAN NILAI ANDA");
        System.out.print("masukkan nilai awal = ");
        nilaiAwal = userInput.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir = userInput.nextInt();

        System.out.println("WHILE");
        if (nilaiAkhir >= 10 && nilaiAkhir < 10) {
            total = 0;
            while (nilaiAwal <= nilaiAwal){
                nilaiAwal++;
                total = total + nilaiAwal;
                System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            }
        }






        System.out.println("LOOPING SELESAI");





    }
}