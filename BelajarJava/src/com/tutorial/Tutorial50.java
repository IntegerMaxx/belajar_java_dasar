package com.tutorial;

import java.lang.String;


public class Tutorial50 {
/*
String Builder digunakan saat kita akan membuat
Sebuah String yang panjang bangettttt. menggunakan
String builder adalah sesuatu ke niscayaan.
Intinya StringBuider ini kita bisa memanipulasi data
String yang alokasi memorinya tetap (Menghemat memori)

append itu untuk menambah kata atau kalimat di String (ditambahkan di ujung
nilai String) daripada kita menggunakan concat, kalau concat alokasi
memorinya berubah tapi kalau append alokasi memorinya tetap.
*/

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        // append
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga Surabaya");
        printData(builder);

        // insert
        builder.insert(19, " Kota");
        printData(builder);

        // delete
        builder.delete(19,24);
        printData(builder);

        // rubah character pada index tertentu
        builder.setCharAt(14, 'W');
        printData(builder);

        // replace
        builder.replace(20,28, "Bandung");
        printData(builder);

        // casting menjadi String
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));

    }

    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder) + "\n");




    }
}