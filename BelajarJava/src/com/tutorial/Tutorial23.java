package com.tutorial;

import java.util.Scanner;

public class Tutorial23 {

    // swith case


    public static void main(String[] args){


        String input;

        Scanner userInput = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = userInput.next();
//        System.out.println(input);

        // expresinya berupa satuan (int,long,byte,short), String dan enum
        // Jika salah satu case bernilai true maka semua (case) akan dijalani semua. caranya agar bisa satu-satu menggunakan (break;)
        switch (input){
            case "otong":
                System.out.println("Saya otong dan hadir Bos!!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir Bos!!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir Bos!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }

        System.out.println("selesai program");

    }
}
