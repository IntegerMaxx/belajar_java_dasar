package com.tutorial;


import java.util.Scanner; // Sebenarnya ini adalah folder
                          // Untuk mengakses Scanner 

public class Tutorial17 {
    
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
//        int input = userInput.nextInt();
//        System.out.println("input = " + input);
//        
//        int input2 = userInput.nextInt();
//        System.out.println("input2 = " + input2);
        // Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar
        
        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();
        
        luas = panjang * lebar;
        System.out.println("Luas dari persegi panjang adalah " + luas);
        
        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("volume = " + volume);
    
    }
    
}

