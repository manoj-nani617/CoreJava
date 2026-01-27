package com.techouts.cj2;

public class Operators {
    public static void main(String[] args) {
        // Operator is a symbol that tells the computer to perform certain mathametical manipulation

        // Arthimetic operators
        int a = 10;
        int b = 20;
        int sum = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        int reminder  = a%b;
        System.out.println("Addition Operation"+sum);
        System.out.println("Subtraction OPeration"+subtraction);
        System.out.println("Multiplication Operation"+multiplication);
        System.out.println("Division Operation"+division);
        System.out.println("Reminder Operation"+reminder);

        //Relational OPerators
        System.out.println(a > b);   // false
        System.out.println(a < b);   // true
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true

        //Logical Operators
        System.out.println(a > 5 && b > 15); // true
        System.out.println(a > 15 && b > 15); // false

        System.out.println(a > 5 || b > 15); // true
        System.out.println(a > 15 || b > 15); // false


        System.out.println(! false); // true
        System.out.println(!true);

        // Assignment Operators
        a += 5;   // a = 15
        a -= 3;   // a = 12
        a *= 2;   // a = 24
        a /= 4;   // a = 6
        a %= 4;

        // Increment or Decrement Operator
        System.out.println(a++); //Post Increment
        System.out.println(++a); //Pre Increment
        System.out.println(a--); //Post Decrement
        System.out.println(--a); //Pre Decrement

        //Bitwise Operators

        System.out.println(a & b);  // BitWise AND
        System.out.println(a | b);  //BitWise OR
        System.out.println(a ^ b);  //BitWise XOR
        System.out.println(a<<1);   //BitWise LEFT SHIFT
        System.out.println(a>>2);   //BitWise RIGHT SHIFT



    }
}
