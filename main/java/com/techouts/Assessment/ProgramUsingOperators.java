package com.techouts.Assessment;

public class ProgramUsingOperators {
    void arithmeticOperators() {
        int a = 10;
        int b = 3;
        System.out.println("ARITHMETIC OPERATORS PROGRAM");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

    }
    void relationalOperators(){
        int a = 10;
        int b = 20;
        System.out.println("RELATIONAL OPERATORS PROGRAM");
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a > b);   // false
        System.out.println(a < b);   // true
        System.out.println(a >= b);  // false
        System.out.println(a <= b);  // true
    }
    void logicalOperators() {
        int a = 10, b = 20;
        System.out.println("LOGICAL OPERATORS PROGRAM");
        System.out.println((a < b) && (a > 5));   // true
        System.out.println((a > b) || (a < b));   // true
        System.out.println(!(a == b));            // true
    }
    void operatorsProgram() {
        int num = 7;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is not a Prime number");
    }
    public static void main(String[] args) {
        ProgramUsingOperators p = new ProgramUsingOperators();
        p.arithmeticOperators();
        p.relationalOperators();
        p.logicalOperators();
        p.operatorsProgram();

    }

}
