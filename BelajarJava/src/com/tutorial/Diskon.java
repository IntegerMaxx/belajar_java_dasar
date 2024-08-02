package com.tutorial;

import java.util.Scanner;

public class Diskon {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        int harga1, harga2, harga3, harga4, harga5, harga6;
        harga1 = 100000;
        harga2 = 499000;
        harga3 = 999000;
        harga4 = 1499000;
        harga5 = 1999000;
        harga6 = 2000000;

        System.out.println("masukkan harga");
        int masukkanHarga = userInput.nextInt();

        if (masukkanHarga < harga1) {
            System.out.println("\n===================");
            System.out.println("diskon anda " + "0%");
            System.out.println("anda tidak mendapat potongan harga");
        } else if (masukkanHarga <= harga2) {
            int hasil = masukkanHarga * 5 / 100;
            int hasil2 = masukkanHarga - hasil;
            System.out.println("\n===================");
            System.out.println("diskon anda " + "5%");
            System.out.println("Anda mendapat ptongan harga " + hasil);
            System.out.println("total yang harus anda bayar adalah " + hasil2);
        } else if (masukkanHarga <= harga3) {
            int hasil = masukkanHarga * 10 / 100;
            int hasil2 = masukkanHarga - hasil;
            System.out.println("\n===================");
            System.out.println("diskon anda " + "10%");
            System.out.println("Anda mendapat ptongan harga " + hasil);
            System.out.println("total yang harus anda bayar adalah " + hasil2);
        } else if (masukkanHarga <= harga4) {
            int hasil = masukkanHarga * 15 / 100;
            int hasil2 = masukkanHarga - hasil;
            System.out.println("\n===================");
            System.out.println("diskon anda " + "15%");
            System.out.println("Anda mendapat ptongan harga " + hasil);
            System.out.println("total yang harus anda bayar adalah " + hasil2);
        } else if (masukkanHarga <= harga5) {
            int hasil = masukkanHarga * 20 / 100;
            int hasil2 = masukkanHarga - hasil;
            System.out.println("\n===================");
            System.out.println("diskon anda " + "20%");
            System.out.println("Anda mendapat ptongan harga " + hasil);
            System.out.println("total yang harus anda bayar adalah " + hasil2);
        } else if (masukkanHarga >= harga6) {
            int hasil = masukkanHarga * 25 / 100;
            int hasil2 = masukkanHarga - hasil;
            System.out.println("\n===================");
            System.out.println("diskon anda " + "25%");
            System.out.println("Anda mendapat ptongan harga " + hasil);
            System.out.println("total yang harus anda bayar adalah " + hasil2);
        }
    }
}
