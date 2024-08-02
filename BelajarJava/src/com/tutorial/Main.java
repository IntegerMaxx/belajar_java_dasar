package com.tutorial;


public class Main {
    public static void main(String[] args) {
        String teks = "Ini adalah contoh string";

        // Mengambil substring dari indeks 8 hingga 14 (indeks dimulai dari 0)
        String potongan = teks.substring(3, 10);

        System.out.println("Potongan string: " + potongan);
    }
}