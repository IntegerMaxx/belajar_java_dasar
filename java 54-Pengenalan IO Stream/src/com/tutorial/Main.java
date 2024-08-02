package com.tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        try {
//            FileInputStream fileInput = new FileInputStream("input.txt");
//        } catch (Exception e){
//            System.err.println(e);
//        }

        FileInputStream fileInput = new FileInputStream("input.txt");

        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());

    }

}
/*
[CATATAN PENTING SEKALI]
jadi untuk mengeksekusi file jar dijava menggunakan cmd harus menggunakan command ini
{java -jar "_54-Pengenalan IO Stream.jar"}. jar file ini hanya menyimpan source code yang
sebelumnya.Setelah menjadi jar file, dia hanya akan mengeksekusi kode yang ada pada jar
file (source code sebelumnya). jika pada source code kita edit, maka tidak akan
berpengaruh pada file jar
*/