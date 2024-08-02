package com.tutorial;


public class Tutorial15 {
    
    public static void main(String[] args){
        
/*      # Operator Logika --> Operasi yang bisa kita
          lakukan kepada tipe data boolean
        # AND, OR, XOR, negasi
*/       

        boolean a,b,c;
        
        // OR / atau (||)
        System.out.println("==== OR (||) ====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        
        // AND / dan (&&)
        System.out.println("==== AND (&&) ====");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        
        // XOR / exclusive OR (^)
        System.out.println("==== XOR (^) ====");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        
        // NOT / negasi > (!) untuk mengflip (flipping)
        // nilai atau membalikkan nilai
        System.out.println("==== NEGASI (!) ====");
        a = true;
        c = !a;
        System.out.println(a + " ---> (!) " + c);
        
        a = false;
        c = !a;
        System.out.println(a + " ---> (!) " + c);
    }   
    
}
