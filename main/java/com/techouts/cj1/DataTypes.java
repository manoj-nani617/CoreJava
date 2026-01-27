package com.techouts.cj1;

public class DataTypes {
    public static void main(String[] args) {
        // ***********Data types determines what type of value a variable can hold ***************
        // IN Java we have Data Types :
        // short it stores the integer values RANGE -32,768 to 32,767 and its DEFAULT VALUES IS  0
        short shortVar = -32768;
        short shortVar2 = 32767;
        System.out.println("This is the short data type");

        // byte  it stores the integer values RANGE -127 to 127 and its DEFALUT VALUE IS 0
        byte byteVar = -127;
        byte byteVar2 = 127;
        System.out.println("This is the byte data type");

        // int  IT STORES THE NUMERICAL VALUES RANGE −2,147,483,648 to 2,147,483,647 DEFAULT VALUE IS 0
        int intVar = -2147483648;
        int intVar2 = 2147483647;
        System.out.println("This is the int data type");

        //float  STORES THE DECIMAL VALUES RANGE ±3.4 × 10³⁸ 6–7 DEDCIMA DIGITS DEFAULT VALUE IS 0.0f
        System.out.println("This is the float data type");

        //double is a 64-bit double-precision floating-point data type used to store decimal numbers.
        System.out.println("This is the double Data type");

        //char is used to store single characters
        char c = 'a';

        //boolean is used to store true or false default value is false
        boolean value = true || false;
        System.out.println("This is the boolean data type");

        //long is used to store the integers in the range −9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 DEFAULT VALUE IS 0L
        long longVar = -9223372036854775808L;
        long longVar2 = 9223372036854775807L;
        System.out.println("This is the Long data type");
    }
}
