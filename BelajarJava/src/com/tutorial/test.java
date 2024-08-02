package com.tutorial;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        int angka, angka1;

        Scanner userInput = new Scanner(System.in);

        System.out.println("mulai");
        System.out.print("masukkan angka ");
        angka = userInput.nextInt();
        if (angka == 10){

            System.out.println("angka yang anda masukkan bernilai benar ");

        }else if (angka > 100){

            System.out.println("jika angkanya lebih besar dari 100 maka ini yang keluar");

        }else if (angka == 10){

            System.out.println("jika angkanya kurang dari 100 maka ini yang keluar");

        } else {

            System.out.println("angka yang anda masukkan pasti dibawah dari 100");

        }




        System.out.println("selesai");









    }

}
