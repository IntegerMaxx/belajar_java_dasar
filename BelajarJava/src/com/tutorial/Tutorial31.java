package com.tutorial;

import java.util.*;

public class Tutorial31 {
    public static void main (String[] args){

        // mmenghitung nilai deret fibonacci ke-n
        int f_n, f_n_1, f_n_2, n;
        // Buat dalam bentuk while dan do while

        System.out.println("+++ AWAL FOR +++");
        Scanner inputUser = new Scanner(System.in);
        System.out.print("mengambil nilai fibonnaci ke - : ");
        n = inputUser.nextInt();
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        for (int i = 1; i <= n; i++){
            System.out.println("nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
        System.out.println("+++ AKHIR FOR +++");

        System.out.println("------------------");

        System.out.println("+++ AWAL WHILE +++");
        Scanner inputUser2 = new Scanner(System.in);
        System.out.print("mengambil nilai fibonnaci ke - : ");

        n = inputUser2.nextInt();
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        int i = 0;

        while (i < n){
            i++;
            System.out.println("nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;


        }
        System.out.println("+++ AKHIR WHILE +++");

        System.out.println("------------------");

        System.out.println("+++ AWAL DO +++");
        Scanner inputUser3 = new Scanner(System.in);
        System.out.print("mengambil nilai fibonnaci ke - : ");
        n = inputUser3.nextInt();
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        i = 1;
        do {
            System.out.println("nilai ke - " + i + " adalah " + f_n);
            i++;
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;

        } while (i <= n);
        System.out.println("+++ AKHIR DO +++");

        System.out.println("------------------");

    }
}
