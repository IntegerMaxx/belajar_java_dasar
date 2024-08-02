package com.tutorial;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // Membuka file

        // byte stream -> FileInputStream | akan jadi file output saat output
        // Character stream -> FileReader | akan jadi file writer saat output

        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader      charFileInput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter charFileOutput = new FileWriter("outputChar.txt");

        // Membaca File

        // byte file
        int buffer = byteFileInput.read();

        while (buffer != -1){
            System.out.print((char) buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println("\n");
        // char file
        buffer = charFileInput.read();

        while (buffer != -1){
            System.out.print((char) buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }


        // Menutup File
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();

    }
}
