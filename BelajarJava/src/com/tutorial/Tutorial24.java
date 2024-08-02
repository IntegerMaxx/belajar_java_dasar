package com.tutorial;

import java.util.*;

// ternary operator > salah satu metode untuk mempersingkat kondis if stetment
public class Tutorial24 {
    public static void main(String[] args){

        // variable x = ekpresi ? statement_true : statement_false
        // ternary operator
        int input, x;
        Scanner inputUser = new Scanner(System.in); // ini sebenarnya adalah object
        System.out.print("masukkan nilai: ");
        input = inputUser.nextInt();


        // variabel x = ekspresi ? statement_true : statement_false
        // ternary operator lebih memudahkan dibandingkan dengan if else stetment

        x = (input == 10) ? (input*input) : (input/2);

        // jika memakai if
//        if (input == 10){
//            x = input*input;
//        } else {
//            x = input/2;
//        }

        System.out.println("ini adalah hasilnya "  + x );






    }
}
