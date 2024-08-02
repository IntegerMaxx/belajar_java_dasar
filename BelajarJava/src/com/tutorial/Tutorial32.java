package com.tutorial;

public class Tutorial32 {
    public static void main (String[] args){
        // kita punya 3 buah kata kunci utama.
        // break, continue dan return

        // break itu akan keluar dari sini. langsung ke
        //"  akhir dari looping". yang dibawahnya "a++" jika sudah tidak sesuai dengan inisialisasi awal "a == 10"
// Sebenarnya "return" itu pasangannya dengan method "public static void main". Sehingga ketika sudah sampai di return
// dia akan mengembalikan ke baris setelah method
        int a = 0;
        while (true){
            a++;
            if(a==10){
                break;
                // ini adalah keyword untuk memaksa keluar dari looping
            } else if (a == 5) {
                continue;
                // ini adalah keyword untuk memaksa memulai aksi dari awal
            } else if (a == 7 ) {
            }
            System.out.println("looping ke - " + a);
            return;
        }
        System.out.println("akhir dari looping");
    }
}
