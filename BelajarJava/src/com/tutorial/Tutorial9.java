package com.tutorial;

public class Tutorial9 {

    public static void main(String[] args){
        // tipe data di java:
        // integer, byte, short, long, double, float, char,boolean

        // integer (satuan)
        int i = 2147483647;
        System.out.println("\n====INTEGER====");
        System.out.println("nilai integer i = " + (i +1));
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        System.out.println("Nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar integer = " + Integer.SIZE + " bit");

        // byte (satuan)
        byte b = 10;
        System.out.println("\n====BYTE====");
        System.out.println("nilai byte b = " + b );
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar byte dalam bit = " + Byte.SIZE + " bit");

        // short (satuan)
        short s = 10;
        System.out.println("\n====SHORT====");
        System.out.println("nilai short s = " + s );
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar short = " + Short.BYTES + " bytes");
        System.out.println("Besar short dalam bit = " + Short.SIZE + " bit");

        // long (satuan)
        long l = 10L;
        System.out.println("\n====LONG====");
        System.out.println("nilai long b = " + l );
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar long = " + Long.BYTES + " bytes");
        System.out.println("Besar long dalam bit = " + Long.SIZE + " bit");

        // double (koma, bilangan real)
        double d = -10.5d;
        System.out.println("\n====DOUBLE====");
        System.out.println("nilai double d = " + d );
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + " bytes");
        System.out.println("Besar Double dalam bit = " + Double.SIZE + " bit");

        // float (koma, bilangan real)
        float f = -8.5f;
        System.out.println("\n====FLOAT====");
        System.out.println("nilai float f = " + f );
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES + " bytes");
        System.out.println("Besar float dalam bit = " + Float.SIZE + " bit");

        // Character (karakter) berdasarkan ASCII code
        char c = 'c';
        System.out.println("\n====CHAR====");
        System.out.println("nilai char c = " + c );
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Nilai min = " + Character.MIN_VALUE);
        System.out.println("Besar char = " + Character.BYTES + " bytes");
        System.out.println("Besar char dalam bit = " + Character.SIZE + " bit");

        // boolean (nilai true atau false)
        boolean val = true;
        System.out.println("\n====BOOLEAN====");
        System.out.println("nilai boolean val = " + val );
        System.out.println("Nilai max = " + Boolean.TRUE);
        System.out.println("Nilai min = " + Boolean.FALSE);
//        System.out.println("Besar boolean = " + Boolean.BYTES + " bytes");
//        System.out.println("Besar boolean dalam bit = " + Boolean.SIZE + " bit");
// kalau di c++ ada unsigned maksudnya adalah tipe data yang tidak memiliki batas minimal
// kalau dibahasa pemrograman java tidak ada

    }

}
