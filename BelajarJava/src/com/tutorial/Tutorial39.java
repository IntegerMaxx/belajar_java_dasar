package com.tutorial;

import java.util.Scanner;

public class Tutorial39 {
    public static void main(String[] args){

        int hasilInteger;
        hasilInteger = tambah(4,5);
        printAngka(hasilInteger);
/*
berarti code ini hasilInteger = tambah(11,12,13);
                 printAngka(hasilInteger);
menunjukkan bahwa nilai parameter bisa kita kita isi dengan
nilai langsung atau bisa juga menggunakan variabel
 */
        hasilInteger = tambah(11,12,13);
        printAngka(hasilInteger);

        float hasilFloat;
        hasilFloat = tambah(4.5f, 6);
        printAngka(hasilFloat);

        hasilFloat = tambah(6, 4.5f);
        printAngka(hasilFloat);




        printAngka(10);
        printAngka(10.5f);
        printAngka(15.5d);
        printAngka(200);
    }

    private static int tambah (int angkaInt1, int angkaInt2, int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }

    private static float tambah (int angkaInt2, float angkaFloat1){
        return angkaFloat1 + angkaInt2;
    }

    private static float tambah (float angkaFloat1, int angkaInt2){
        return angkaFloat1 + angkaInt2;
    }

    private static int tambah (int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }

    private static void printAngka (double angkaDouble) {
        System.out.println("angka ini adalah double dengan nilai = " + angkaDouble);
    }

    private static void printAngka (float angkaFloat) {
        System.out.println("angka ini adalah float dengan nilai = " + angkaFloat);
    }

    private static void printAngka (int angkaInteger) {
        System.out.println("angka ini adalah integer dengan nilai = " + angkaInteger);
    }
}
