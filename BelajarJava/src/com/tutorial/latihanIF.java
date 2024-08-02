package com.tutorial;
import java.util.Scanner;
public class latihanIF {
    public static void main(String[] args){
        int angka, angka1, angka2;

        Scanner userInput = new Scanner(System.in);

        System.out.println("=== START ===");
        System.out.print("masukkan angka pertama = ");
        angka = userInput.nextInt();
        System.out.print("\nnasukkan angka kedua = ");
        angka1 = userInput.nextInt();
        System.out.print("\nnasukkan angka ketiga = ");
        angka2 = userInput.nextInt();

        if (angka == 10){
            System.out.println("ini adalah stetment 1");
        } else {
            if (angka1 == 12){
                System.out.println("ini adalah stetment 4");
            } else if (angka2 == 15){
                System.out.println("ini adalah stetment 2");
            } else {
                System.out.println("ini adalah stetment 3");
            }
        }
        System.out.println("=== FINISH ===");
    }
}
