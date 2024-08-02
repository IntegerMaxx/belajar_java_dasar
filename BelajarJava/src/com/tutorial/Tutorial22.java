package com.tutorial;

public class Tutorial22 {
    public static void main(String[] args) {
//        nested if atau if bersarang
        int a = 2;
        int b = 10;

        System.out.println("ini adalah awal dari program");

        if (a == 5) {

            if (b == 10) {

                System.out.println("ini adalah aksi true, dimana a = 5 dan b = 10");

            } else {

                System.out.println("ini adalah aksi default 2, dimana a = 5 dan b bukan 10");

            }

        } else {

            System.out.println("default 1. ini adalah dimana a salah");

        }

        System.out.println("ini adalah akhir program");
    }

}
