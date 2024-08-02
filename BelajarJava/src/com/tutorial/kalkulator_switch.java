package com.tutorial;

import java.util.*;
public class kalkulator_switch {
    public static void main(String[] args){
        System.out.println("ini adalah kalkulator sederhana");
        float a,b, hasil;
        char operator;

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan angka pertama = " );
        a = userInput.nextFloat();
        System.out.print("masukkan operator = ");
        operator = userInput.next().charAt(0);
        System.out.print("masukkan angka kedua = ");
        b = userInput.nextFloat();

        System.out.println("angka dan operator yang anda masukkan = " + a + " " + operator + " " + b);
        switch (operator){
            case '+':
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case '-':
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case '/':
                if (a == 0 ){
                    System.out.println("hasilnya tetap aja nol (0)");
                    if (b == 0) {
                        System.out.println("hasilnya tak terhingga");
                    }
                } else {
                    hasil = a/b;
                    System.out.println("hasil = " + hasil);
                }
                break;
            default:
                System.out.println("operator tidak ditemukkan");
        }
        System.out.println("selesai");
    }
}
