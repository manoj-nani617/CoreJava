package com.techouts.cj2;
import java.util.*;


// SWITCH STATEMENT IS USED TO EXECUTE ONE BLOCK OF CODE AMONG MANY POSSIBLE OPTIONS BASED
// ON THE VALUE OF A VARIABLE

// CONTROL FLOW :
// INITIALLY MATCHES THE EXPRESSION IN SEQUENCE.
// IF ANY ONE OF THE CASE IS MATCHES THEN CORRESPONDING BLOCK GET EXECUTED
// NO MATCH FOUND THE DEFAULT BLOCK GET EXECUTED.



public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the operation :\nAddition\nSubtraction\nMultiplication\nDivision\nReminder");
        String s = sc.next();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        switch(s) {
            case "Addition" -> {
                System.out.println("Entered into the Addition Block");
                int sum = a+b;
                System.out.println(sum);
            }
            case "Subtraction" -> {
                System.out.println("Entered into the Subtraction Block");
                int subtraction = a-b;
                System.out.println(subtraction);
            }
            case "Multiplication" -> {
                System.out.println("Entered into the Multiplication Block");
                int mul = a*b;
                System.out.println(mul);
            }
            case "Division" -> {
                System.out.println("Entered into the Division Block");
                int div = a+b;
                System.out.println(div);
            }
            case "modulo" -> {
                System.out.println("Entered into the Modulo Block");
                int mod = a+b;
                System.out.println(mod);
            }
            default -> System.out.println("Please Enter Operation");
        }
    }
}
