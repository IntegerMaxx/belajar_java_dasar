package com.tutorial;

import java.io.*;
import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean islanjutkan = true;


        while (islanjutkan) {
            clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    cariData();
                    tampilkanData();
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    tambahData();
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    updateData();
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    deleteData();
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-5]");

            }

            islanjutkan = getYesorNo("Apakah Anda ingin melanjutkan");
        }

    }

    private static void updateData() throws IOException {
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        tampilkanData();


        // ambil user input / pilihan data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukkan nomor buku yang akan diupdate: ");
        int updateNum = terminalInput.nextInt();

        // tampilkan data yang ingin diupdate
        String data = bufferedInput.readLine();
        int entryCount = 0;

        while (data != null){
            entryCount++;

            StringTokenizer st = new StringTokenizer(data, ",");

            // Tampilkan entryCounts == updateNum
            if (updateNum == entryCount){
                System.out.println("\nData yang ingin Anda update adalah:");
                System.out.println("----------------------------------------");
                System.out.println("Referensi          : " + st.nextToken());
                System.out.println("Tahun              : " + st.nextToken());
                System.out.println("Penulis            : " + st.nextToken());
                System.out.println("Penerbit           : " + st.nextToken());
                System.out.println("Judul              : " + st.nextToken());

                // update data

                // mengambil input dari user
                String[] fieldData = {"tahun","penulis","penerbit","judul"};
                String[] tempData = new String[4];

                // refresh token
                st = new StringTokenizer(data, ",");
                String originalData = st.nextToken();

                for (int i=0; i < fieldData.length; i++){
                    boolean isUpdate = getYesorNo("Apakah Anda ingin merubah " + fieldData[i]);
                    originalData = st.nextToken();
                    if (isUpdate){
                        // user input
                        if (fieldData[i].equalsIgnoreCase("tahun")){
                            System.out.print("masukan tahun penerbit, format=(YYYY): ");
                            tempData[i] = ambilTahun();
                        } else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("\nMasukan " + fieldData[i] + " baru: ");
                            tempData[i] = terminalInput.nextLine();
                        }
                    } else {
                        tempData[i] = originalData;
                    }
                }

                // tampilkan data baru ke layar
                st = new StringTokenizer(data, ",");
                st.nextToken();
                System.out.println("\nData baru Anda adalah:");
                System.out.println("----------------------------------------");
                System.out.println("Tahun              : " + st.nextToken() + " ---> " + tempData[0]);
                System.out.println("Penulis            : " + st.nextToken() + " ---> " + tempData[1]);
                System.out.println("Penerbit           : " + st.nextToken() + " ---> " + tempData[2]);
                System.out.println("Judul              : " + st.nextToken() + " ---> " + tempData[3]);

                boolean isUpdate = getYesorNo("Apakah Anda yakin ingin menupdate data tersebut");

                if (isUpdate){


                    // cek data baru di database
                    boolean isExist = cekBukuDiDatabase(tempData, false);

                    if (isExist){
                        System.err.println("data buku sudah ada di database, proses update dibatalkan, \nsilahkan delete data yang bersangkutan");
                        bufferedOutput.write(data);
                    } else {

                        // format data baru kedalam database
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];

                        // kita bikin primary key
                        long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;

                        String penulisTanpaSpasi = penulis.replaceAll("\\s+", "");
                        String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;

                        // tulis data ke database
                        bufferedOutput.write(primaryKey+","+tahun+","+penulis+","+penerbit+","+judul);
                    }
                } else {
                    bufferedOutput.write(data);
                }
            } else {
                // copy data
                bufferedOutput.write(data);
            }
            bufferedOutput.newLine();

            data = bufferedInput.readLine();
        }

        // menulis data ke file
        bufferedOutput.flush();
        bufferedOutput.close();
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();

        System.gc();

        // delete original database
        database.delete();
        // rename file tempDB menjadi database

        tempDB.renameTo(database);





    }

    private static void deleteData() throws IOException {
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        tampilkanData();

        // kita ambil user input untuk mengdelete data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukkan nomor buku yang akan dihapus: ");
        int deleteNum = terminalInput.nextInt();

        // looping untuk membaca tiap data baris dan skip data yang akan didelete

        boolean isFound = false;
        int entryCounts = 0;

        String data = bufferedInput.readLine();

        while (data != null){
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(data, ",");
            // tampilkan data yang ingin di hapus
            if (deleteNum == entryCounts) {
                System.out.println("\nData yang ingin anda hapus adalah: ");
                System.out.println("___________________________________");
                System.out.println("Referensi       : " + st.nextToken());
                System.out.println("Tahun           : " + st.nextToken());
                System.out.println("Penulis         : " + st.nextToken());
                System.out.println("Penerbit        : " + st.nextToken());
                System.out.println("Judul           : " + st.nextToken());

                isDelete = getYesorNo("Apakah anda yakin akan menghapus?");
                isFound = true;
            }


            if (isDelete){
                // skip pindahkan data dari original ke sementara
                System.out.println("Data berhasil dihapus");
            } else {
                // kita pindahkan data dari original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }

        if (!isFound) {
            System.err.println("Buku tidak ditemukan");
        }

        // menulis data ke file
        bufferedOutput.flush();

        bufferedOutput.close();
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();

        System.gc();

        // delete original file
        database.delete();

        // rename file sementara ke database
        tempDB.renameTo(database);

    }

    private static void tampilkanData() throws IOException {

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception ex){
            System.err.println("Database Tidak ditemukkan");
            System.err.println("Silahkan Tambah data terlebih dahulu");
            tambahData();
            return;
        }


        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("| No |\tTahun |\t      Penulis        |\t     Penerbit        |\t  Judul Buku   |");
        System.out.println("--------------------------------------------------------------------------------");


        String data = bufferInput.readLine();
        int nomorData = 0;
        while (data != null){
            nomorData++;
            StringTokenizer stringToken = new StringTokenizer(data, ",");

            stringToken.nextToken();
            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%4s  ",stringToken.nextToken());
            System.out.printf("|\t%-20s ",stringToken.nextToken());
            System.out.printf("|\t%-20s ",stringToken.nextToken());
            System.out.printf("|\t%s ",stringToken.nextToken());
            System.out.print("\n");
            data = bufferInput.readLine();
        }

        System.out.println("Akhir dari database");

        bufferInput.close();
        fileInput.close();

        System.gc();

    }

    private static void cariData() throws IOException{

        // membaca database ada atau tidak

        try {
            File file = new File ("database.txt");
        } catch (Exception ex){
            System.err.println("Database Tidak ditemukkan");
            System.err.println("Silahkan Tambah data terlebih dahulu");
            tambahData();
            return;
        }

        // kita ambil keyword dari user

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukkan kata kunci untuk mencari buku: ");
        String cariString = terminalInput.nextLine();


        String[] keywords = cariString.split("\\s+");

        // kita cek keyword di database
       cekBukuDiDatabase(keywords, true);

    }

    private static void tambahData() throws IOException{

        FileWriter filoOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferedOutput = new BufferedWriter(filoOutput);

        // Mengambil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("Masukkan nama penulis: ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukkan judul buku: ");
        judul = terminalInput.nextLine();
        System.out.print("Masukkan nama penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukkan tahun terbit, format=(YYYY): ");
        tahun = ambilTahun();

        // cek buku di database

        String[] keywords = {tahun+","+penulis+","+penerbit+","+judul};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekBukuDiDatabase(keywords, false);

        if (!isExist){
//            fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
            System.out.println(ambilEntryPerTahun(penulis, tahun));
            long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;

            String penulisTanpaSpasi = penulis.replaceAll("\\s+", "");
            String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;
            System.out.println("\nData yang akan anda masukkan adalah");
            System.out.println("_________________________________________");
            System.out.println("primary key  : " + primaryKey);
            System.out.println("tahun terbit : " + tahun);
            System.out.println("penulis      : " + penulis);
            System.out.println("judul        : " + judul);
            System.out.println("penerbit     : " + penerbit);

            boolean isTambah = getYesorNo("Apakah anda ingin menambah data tersebut?");

            if (isTambah){
                bufferedOutput.write(primaryKey+","+tahun+","+penulis+","+penerbit+","+judul);
                bufferedOutput.newLine();
                bufferedOutput.flush();

                bufferedOutput.close();
                filoOutput.close();

                System.gc();

            }

        } else {
            System.out.println("\nBuku yang anda akan masukkan sudah tersedia di database dengan data berikut");
            cekBukuDiDatabase(keywords,true);
        }

        bufferedOutput.close();

    }

    private static long ambilEntryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferinput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferinput.readLine();
        Scanner dataScanner;
        String primaryKey;

        while(data != null) {
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            penulis = penulis.replaceAll("\\s+", "");
            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())){
                entry = dataScanner.nextInt();
            }

            data = bufferinput.readLine();
        }
        return entry;
    }

    private static boolean cekBukuDiDatabase(String[] keywords, boolean isDisplay) throws IOException{

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferinput = new BufferedReader(fileInput);

        String data = bufferinput.readLine();
        boolean isExist = false;
        int nomorData = 0;
        while(data != null){

            // cek keywords didalam baris
            isExist = true;

            for(String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }


            // jika keywordsnya cocok maka tampilkan

            if (isExist){
                if (isDisplay){
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("| No |\tTahun |\t      Penulis        |\t     Penerbit        |\t  Judul Buku   |");
                    System.out.println("--------------------------------------------------------------------------------");
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");

                    stringToken.nextToken();
                    System.out.printf("| %2d ", nomorData);
                    System.out.printf("|\t%4s  ",stringToken.nextToken());
                    System.out.printf("|\t%-20s ",stringToken.nextToken());
                    System.out.printf("|\t%-20s ",stringToken.nextToken());
                    System.out.printf("|\t%s ",stringToken.nextToken());
                    System.out.println("\n--------------------------------------------------------------------------------");
                    System.out.print("\n");
                } else {
                    break;
                }
            }


            data = bufferinput.readLine();

        }

        return isExist;

    }

    private static String ambilTahun() throws  IOException {
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();

        while (!tahunValid) {
            try {
                Year.parse(tahunInput);
                tahunValid = true;
            } catch (Exception e){
                System.err.println("Format tahun yang anda masukkan salah, format=(YYYY)");
                System.out.print("\nSilahkan masukkan tahun terbit lagi: ");
                tahunInput = terminalInput.nextLine();
                tahunValid = false;
            }
        }

        return tahunInput;
    }

    private static boolean getYesorNo(String messege){
        Scanner terminalInput = new Scanner(System.in);

        System.out.print("\n" + messege + " (y/n)? ");
        String pilihanUser = terminalInput.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n") ){
            System.err.println("Pilihan Anda bukan y atau n");
            System.out.print("\n" + messege + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen(){
        try{
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }

}
