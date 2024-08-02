package com.tutorial;

import java.util.Arrays;

public class Tutorial46 {
    public static void main(String[] args) {
//          D      {7,8,9}
        int[][] array_2D = {
                {1,2,3},
                {4,5,6},
        };


        System.out.println(array_2D);
        System.out.println(Arrays.toString(array_2D));
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);
        System.out.println(Arrays.deepToString(array_2D));
        System.out.println("\n");

        char[] array_char1 = {'a','b','c'};
        char[] array_char2 = {'a','b','c'};

        char[][] array_char2D = {
                array_char1,
                array_char2
        };

        System.out.println(array_char2D);
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1))); // mengeluarkan addres dalam bentuk integer tapi kita bisa mengubahnya dalam bentuk string
        System.out.println(Integer.toHexString(System.identityHashCode(array_char2))); // mengeluarkan addres dalam bentuk integer tapi kita bisa mengubahnya dalam bentuk string
        System.out.println(Arrays.toString(array_char2D));
        System.out.println(Arrays.deepToString(array_char2D));







    }
}
//
//    int[][][] array_3D = {
//            {
//                    {1,2,3},
//                    {4,5,6},
//                    {7,8,9}
//            },
//            {
//                    {1,2,3,4},
//                    {5,6,7,8},
//                    {9,10,11,12},
//
//            }
//    };
//        System.out.println(Arrays.toString(array_3D[1][0]));
