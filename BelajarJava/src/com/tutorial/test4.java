package com.tutorial;

public class test4 {
    public static void main(String[] args) {
        int result = calculateValue(7); // Memanggil fungsi dan menyimpan nilai kembalian di variabel result
        System.out.println("Nilai yang dikembalikan: " + result);
    }

    // Fungsi untuk menghitung dan mengembalikan nilai berdasarkan kondisi
    private static int calculateValue(int number) {
        int value;

        if (number < 5) {
            value = number * 2;
        } else {
            value = number + 10;
        }

        return value; // Mengembalikan nilai sesuai kondisi if-else
    }
}


