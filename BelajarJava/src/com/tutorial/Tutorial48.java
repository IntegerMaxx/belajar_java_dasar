package com.tutorial;

import java.util.Arrays;

public class Tutorial48 {
    public static void main(String[] args) {

        // membuat String

        String kataString = "hallo";

        char[] kataChar = {'h','a','l','l','o',};

        for (int i = 0; i < kataChar.length; i++){
            char a = kataChar[i];
            System.out.print(a);
        }

        // menampilkan String

        System.out.println("\n" +kataString);
        System.out.println(Arrays.toString(kataChar));

        // mengakses komponen dari String

        System.out.println("komponen ketiga dari char[] = " + kataChar[3]);
        System.out.println("komponen ketiga dari String = " + kataString.charAt(3));

        // merubah komponen dari String
        // itu tidak bisa..kenapa??. String di java itu immutable
        kataChar[0] = 'c';
        // kataString[0] = "c"; <---- Tidak Bisa
        // kataString.charAt(0) = "c"; <---- Tidak Bisa
        System.out.println(Arrays.toString(kataChar));

        // kita bisa merubah komponen secara tidak langsung
        printAddress("kataString",kataString);

        kataString = "c" + kataString.substring(1,5); // ini mengambil karakter di dalam string berdasarkan rentang index

        System.out.println(kataString);

        printAddress("kataString",kataString);

        // memory dari string (String Pool) >> satu slot memori untuk String
        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";


        printAddress( "str_1",str_1);
        printAddress( "str_2",str_2);
        printAddress( "str_3",str_3);

        str_3 = str_3.substring(0,4);
        printAddress( "str_3",str_3);

        String str_4 = "callo";
        printAddress("str_4", str_4);

        kataString = "callo";
        printAddress("kataString",kataString);

        // Kesimpulan
        // 1. String di java itu immutable
        // 2. String yang ada di string pool itu akan reusable, memorinya
        // lebih efisien
        // 3. Membuat string di method baru, maka dia akan ditaruh di memori lain
        // bukan di string pool

        // liat lebih dalam
        String a = new String("hallo");
        printAddress("a", a);




    }

    private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = "+ Integer.toHexString(address));

    }

}
