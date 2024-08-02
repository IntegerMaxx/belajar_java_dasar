package com.tutorial;

import java.util.Formatter;
import java.util.StringJoiner;

public class Tutorial51 {
    public static void main(String[] args) {
        // FORMAT STRING ITU PENTING KALAU KITA MAU BERMAIN DENGAN STRING (AI)
        String nama = "Udin";
        int umur = 17;

        // output : Nama saya adalah udin, umur saya adalah 17"
        System.out.println("Nama saya adalah " + nama + ", umur saya adalah " + umur);

        // cara lainnya adalah dengan format string
        System.out.printf("Nama saya adalah %s, umur saya adalah %d\n",nama,umur);

        // conversion : f=floating point, d=integer, c=character, s=string, b=boolean

        // struktur format = %[argumen_index$][flags][width][.precision]conversion

        // [argumen_index$]
        System.out.println("\n[argumen_index$]");

        // udin, wahai udin, kemana saja kamu udin
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %s1$?\n",nama);
        // umur udin berapa?, udin menjawab: 17, wah masih muda ya umurnya 17
        System.out.printf("\numur %1$s berapa?, \n%1$s menjawab: %2$d, \nWah masih muda ya umurnya %2$d\n",nama,umur);

        // [flags]
        System.out.println("\n[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("%d - %d = %+d\n",int1,int2,hasil);

        // [width]
        System.out.println("\n[width]");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",int3);
        System.out.printf("%5d\n",int3);
        System.out.printf("%-5d\n",int3); // flags = "-", artinya rata kiri
        System.out.printf("%+5d\n",int3); // flags akan mengambil slot di dalam format
        System.out.printf("%+-6d\n",int3); // flags bisa digabungkan
        System.out.printf("%10d\n",int3);
        System.out.printf("%010d\n",int3); // flags = "0", kita tambahkan "0" didepan
        System.out.printf("%+010d\n",int3);
        int int4 = 1000000000;
        System.out.printf("%-,15d\n",int4); // flags = ",", menandakan delimeter per seribu

        System.out.println("\nFLOATING POINT");
        float float1 = 1.543f;
        System.out.printf("%f\n", float1);
        System.out.printf("%+9f\n", float1); // floating point akan mengambil width dengan 6 decimal

        // [.precesion]
        System.out.println("\n[.precesion]");
        float float2 = 15.678f;
        System.out.printf("%f\n", float2);
        System.out.printf("%.1f\n", float2);
        System.out.printf("%.2f\n", float2);
        System.out.printf("%8.2f\n", float2); // gabungkan dengan width
        System.out.printf("%+08.2f\n", float2); // gabungkan dengan width dan flag

        String nama2 = "Ucup";
        float IPK = 3.785123453132122f;

        // struktur format = %[argumen_index$][flags][width][.precision]conversion

        System.out.printf("\nIPK %1$s berapa?,\n%1$s: saya dapat %2$+5.2f\n",nama2,IPK);

        // Kesimpulan
        // Sebenarnya kita bisa mengsave ini ke variabel string
        String info_biasa = "nama: " + nama2 + ", IPK = " + IPK;
        System.out.println("\nbiasa -> " + info_biasa);

        String info_format = String.format("nama: %s, IPK = %2$+5.2f",nama2,IPK);
        System.out.println("string format -> " +info_format);

        // save format ini kedalam string builder

        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);

        formatBuilder.format("nama: %s, IPK = %2$+5.2f",nama2,IPK);
        System.out.println("string builder format -> " +builder_info);
    }
}
/*
Penjelasan tambahan untuk precision, jadi precision itu untuk membuat hasil presisi
dari floating point kita bisa menghilangkan angka 0 yang tidak diperlukan, kemudian
kita bisa melakukan pembulatan bilangan desimal, bisa juga digabungkan dengan width
dan flag
*/


/*
Penjelasan tambahan untuk flags, jadi flags itu untuk menambahkan simbol + -
%-5d artinya nilainya digeser ke kiri (ada slot kosong di kanan jumlah 1),
kalau %5d artinya jumlah karakternya jadi 5 yang tadinya 1000 itu karakternya 4,
sekarang sudah menjadi 5, %+5d itu akan mengisi slot yang kosong, diisi dengan +,
%+-6d >> + akan diisi pada slot kosong dikiri >> - itu untuk geser ke kiri
>> 6 itu jumlah karakternya atau slot >>> kesimpulan, dari %+-6d dia membuat slot
sebanyak 6 kemudian karakter pertama diisi dengan + kemudian digeser ke kiri - angka
seribunya (1000)
*/


/*
Penjelasan "%5d": jadi lima (5) itu lebar dari jumlah karakter yang bisa ditampung
artinya untuk menampilkan angka 1000 yang jumlah lebarnya ada 4 karakter,
dia akan menyisakan lagi satu karakter yang kosong berada pada ujung kiri.
di ketik adalah 5 maka akan ada satu karakter yang kosong berada pada ujung kiri
*/

/*
Penjelasan %1$s : jadi kita tidak perlu membuat namanya menjadi 3 kali, kita cukup
menuliskan %1$s, untuk memanggil variabel nama berulang. 1$ itu untuk indexing,
jadi di dalam printf ini terdapat index. kalimat string "" itu index 0, kemudian
variabel nama itu index 1

*/

/*
jadi System.out.printf(); yang terdapat pada baris 13 itu untuk memprint sebuah format
kedalam bentuk string, setiap format mempunya tipe data. Misalnya %s untuk String, %d untuk
Integer, %f untuk float/double, %b untuk boolean, %c untuk character. Penulisan print
format harus berurutan, kalau tidak akan terdapat masalah keterbacaan. jika tidak ada salah
satu dari urutan tersebut maka akan mengakibatkan error "MissingFormatArgumentException"

*/
