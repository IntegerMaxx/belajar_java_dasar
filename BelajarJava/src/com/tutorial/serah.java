package com.tutorial;

import java.util.*;

public class serah {
    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukkan nilai = " + nilai);

        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);
    }

    private static int jumlahNilai(int parameter){
        System.out.println("parameter = " + parameter);
        if (parameter == 1){
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);

    }

}
/*
      int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);
    }

    private static int jumlahNilai(int parameter){
        System.out.println("parameter = " + parameter);
        if (parameter == 1){
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);

    }

}

Maksud dari kode diatas adalah saat dia sampai pada parameter == 1, maka dia akan return parameter;
dan akan ditangkap oleh return yang berada diluar kemudian di tambahkan dengan jumlahNilai(parameter
yang dikurangi 1). "jumlahNilai(parameter - 1)" tetap akan dibaca walaupun belum dijumlahkan dengan
"return parameter"



 */
