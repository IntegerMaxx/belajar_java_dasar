package com.tutorial;

public class Tutorial33 {
    public static void main (String[] args){

        // looping bersarang

        System.out.println("1");
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        System.out.println("2");
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        System.out.println("3");
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if ((i+j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        System.out.println("4");
        for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.print("* ");
                if (i == j ) {
                    break;
                } else if ((i + j) == 8) {
                    break;
                }
            }
            System.out.print("\n");
        }



        System.out.print("\n");
        System.out.println("=====TUGAS=====");
        System.out.println("**** INI YANG PERTAMA ****");
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                if (j - i >= 0){
                    System.out.print("* ");
                 }  else {
                     System.out.print("  ");
                 }
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        System.out.println("**** INI YANG KEDUA ****");
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                if ((j + i) <= 5){
                    System.out.print("  ");
                }  else {
                    System.out.print("* ");

                }
            }
            System.out.print("\n");
        }

        System.out.println("**** INI YANG KETIGA ****");
        for(int i = 1; i <= 9; i++){
            for (int j = 1; j <= 5; j++){
                if (i-j > 4) {
                    System.out.print("   ");
                }  else if (i + j < 8){
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.print("\n");
        }

        System.out.println("**** INI YANG KEEMPAT ****");
        for(int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                if (j+i < 8) {
                    System.out.print("   ");
                }else if (i-j > 4){
                    System.out.print("   ");
                }else if (j-i > 4){
                    System.out.print("   ");
                }else if (j+i > 16){
                    System.out.print("   ");
                }else{
                    System.out.print("*  ");
                }
            }
            System.out.print("\n");
        }









    }
}
