package com.tutorial;

import java.util.Scanner;

public class tiketPesawat {
    public static void main (String[] args){
        System.out.println("\n=SELAMAT DATANG DI APLIKASI TIKET PESAWAT=");
        System.out.println("===========AIR WIJAYA AIRPLANES===========");
        serah();

    }

    private static void serah ( ){
        Scanner userInput = new Scanner(System.in);
        System.out.print("nama anda = ");
        String nama = userInput.nextLine();
        System.out.print("Kota tujuan = ");
        String tujuan = userInput.nextLine();
        System.out.print("harga tiket = ");
        int hargaTiket = userInput.nextInt();
        System.out.print("umur anda = ");
        int umur = userInput.nextInt();
        System.out.print("jumlah penumpang = ");
        int penumpang = userInput.nextInt();

        System.out.println("=====================");
        System.out.println(nama + " kota yang anda tuju " + tujuan + ", anda membayar tiket senilai " + hargaTiket);
        System.out.println("Umur anda " + umur + " tahun");
        System.out.println("jumlah penumpang yang naik " + penumpang);
        System.out.println("=====================");
        tipe(hargaTiket,umur,penumpang);
        System.out.println("Terima kasih karena telah menggunakan pelayanan kami\n");

        serah();
    }

    private static int tipe (int hargaTiket, int umur, int penumpang) {
        int hasil = 0;
        if (umur > 2) {
            hasil = penumpang * (hargaTiket * 100) / 100;
            System.out.println("Anda sudah dewasa");
            System.out.println("total yang harus anda bayar adalah " + hasil);
        } else if (umur <= 2 ) {
            hasil = penumpang * (hargaTiket * 10) / 100;
            System.out.println("Anda masih balita");
            System.out.println("total yang harus anda bayar adalah " + hasil);

        }
        return hasil;
    }
}
