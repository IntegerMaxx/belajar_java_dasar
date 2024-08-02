package com.tutorial;

// ini hanyalah coba-coba
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Latihan1 {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("==== MENGHITUNG LUAS PERSEGI ====");
        int a, luasPersegi;

        System.out.print("MASUKKAN SISI = ");
        a = userInput.nextInt();

        luasPersegi = (a*a)*(a*a);
        System.out.println("LUAS PERSEGI ADALAH " + luasPersegi + "CM");




    }


}
