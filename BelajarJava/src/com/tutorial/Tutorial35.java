package com.tutorial;


public class Tutorial35 {
    public static void main (String[] args){

        System.out.println(simple());
        fungsiVoid("apa pun");
        selamatPagi("emak");
        selamatPagi("abah");
    }

    private static void selamatPagi(String nama) {
        System.out.println("selamat pagi " + nama);
    }

    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    // fungsi atau method dengan kembalian
    // sehingga menggunakan return untuk
    // mengembalikkan nilainya (10.0f)
    private static float simple(){
        return 10.0f;
    }
}
