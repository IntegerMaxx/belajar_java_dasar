package com.tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Contoh {

    public static void main(String[] args) throws IOException {


        FileInputStream inputFile = new FileInputStream("input.txt");
        System.out.println((char) inputFile.read());
/*
PENJELASAN: jadi kita bisa membuat throws Exception di baris code
method utama atau di baris code method lainnya. Tapi kekurangannya
programnya akan error dengan kata lain programnya tidak akan jalan
sama sekali.
*/



    }

}
