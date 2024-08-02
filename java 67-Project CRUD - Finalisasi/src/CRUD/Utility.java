package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Utility {

    static long ambilEntryPerTahun(String penulis, String tahun) throws IOException {
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

    // Default access modifier
    static boolean cekBukuDiDatabase(String[] keywords, boolean isDisplay) throws IOException{

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferinput = new BufferedReader(fileInput);

        String data = bufferinput.readLine();
        boolean isExist = false;
        int nomorData = 0;

        if (isDisplay){
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("| No |\tTahun |\t      Penulis        |\t     Penerbit        |\t  Judul Buku   |");
            System.out.println("--------------------------------------------------------------------------------");
        }

        while(data != null){

            // cek keywords didalam baris
            isExist = true;

            for(String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }


            // jika keywordsnya cocok maka tampilkan

            if (isExist){
                if (isDisplay){
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");

                    stringToken.nextToken();
                    System.out.printf("| %2d ", nomorData);
                    System.out.printf("|\t%4s  ",stringToken.nextToken());
                    System.out.printf("|\t%-20s ",stringToken.nextToken());
                    System.out.printf("|\t%-20s ",stringToken.nextToken());
                    System.out.printf("|\t%s ",stringToken.nextToken());
                    System.out.println("\n--------------------------------------------------------------------------------");
                } else {
                    break;
                }
            }


            data = bufferinput.readLine();

        }

        return isExist;

    }

    protected static String ambilTahun() throws  IOException {
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

    public static boolean getYesorNo(String messege){
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

    public static void clearScreen(){
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
