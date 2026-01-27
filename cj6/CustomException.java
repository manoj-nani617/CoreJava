package com.techouts.cj6;

class InvalidException extends Exception {
    InvalidException(String message) {
        super(message);
    }
}
public class CustomException {
//    Custom Exception is used to create the exception
//    When the situation encounters that time we need to create the exception to handle problems that time Custom exception is used
    public static void main(String[] args) throws InvalidException {
        int age = 10;
        if (age < 18)
            throw new InvalidException("This is the CustomException");
        else System.out.println("it is okay");

    }
}
