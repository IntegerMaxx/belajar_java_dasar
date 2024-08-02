package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Tutorial52 {
    public static void main(String[] args) {

        int[] array = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("nilai array ke: ");
        int index = userInput.nextInt();

        // exception handling (try,catch,finally)
        System.out.println("Handling out of bound");
        try {
            System.out.printf("index ke-%d, adalah %d\n\n", index , array[index]);
        } catch (ArrayIndexOutOfBoundsException exception_messege) {
            System.err.println(exception_messege);
        }

        // runtime error ketika file tidak ada
        System.out.println("Handling IO not found\n");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException exception_messege) {
            System.err.println(exception_messege);
        }

        // menggabungkan dua exception
        System.out.println("menggabungkan dua buah exception");
        try {
            System.out.printf("index ke-%d, adalah %d\n\n", index , array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException exception_messege){
            System.err.println("index yang anda masukkan tidak sesuai dengan jumlah array");
        } catch (IOException exception_messege) {
            System.err.println("File tidak ditemukan");
        }

        // finally

        System.out.println("Menambahkan finally");

        try {
            System.out.printf("index ke-%d, adalah %d\n", index , array[index]);
        } catch (ArrayIndexOutOfBoundsException exception_messege){
            System.err.println("index yang anda masukkan tidak sesuai dengan jumlah array");
        } finally {
            System.out.println("Finally");
        }
/*
PENJELASAN: jadi finally itu untuk mengclose exception jika sudah selesai. Finally ini
dilakukan ketika dua buah ini dilakukan (try,catch)

*/
        System.out.println("\nAkhir dari program");
    }
}
/*
PENJELASAN: jadi exception itu dia akan bekerja sebagai penangkal out of bounds atau
nilai yang keluar dari yang sudah di tentukan di dalam array. Kita sudah menentukan
arraynya adalah 0,1,2,3 dimana use bisa mengakses nilai di dalam array dengan menyebutkan
nilai indexnya. Saat user menginputkan angka 4 atau index ke 4 maka program akan error
exception. tapi dengan adanya try, catch dia akan terus melanjutkan program. try itu
maksudnya dia akan mencoba, kemudian cacth dia akan menampilkan pesan exception dan
program akan terus dilanjutkan
*/

/*
[PENJELASAN TAMBAHAN]
instansiasi itu pembuatan pembuatan objek dari sebuah class

*/

