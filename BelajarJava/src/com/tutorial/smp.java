package com.tutorial;

import java.util.*;

public class smp {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);


        System.out.print("Masukkan nama anda: ");
        String nama = userInput.nextLine();
        System.out.print("Masukkan nilai anda: ");
        int nilai = userInput2.nextInt();

        if ( nilai >= 90 ){
            System.out.println(nama + " nilai anda " + nilai +", anda jenius");
        } else if (nilai <= 90 && nilai >= 60 ) {
            System.out.println(nama + " anda pintar");
        } else if (nilai <= 60 && nilai >= 40 ) {
            System.out.println(nama + " anda kurang belajar");
        } else if (nilai <= 40 && nilai >= 20) {
            System.out.println(nama + " anda salah jurusan");
        } else if (nilai <= 20) {
            System.out.println( nama + " Anda harus ke dokter");
        }


    }
}
