package com.techouts.Assessment3;
interface StaticMethod {
    static void method(){
        System.out.println("This is a first static method in the interface");
    }
    static void method(int a){
        System.out.println("This is a second static method with single parameter in the interface");
    }
    static void method(int a, int b){
        System.out.println("This is a third static method with the three parameters in the interface");
    }
}
public class CallingStaticMethodsUsingInterface {
//    In interface, you can also you define static method and that belongs to the interface itself.
//    That can be called with the help of interface name.
    public static void main(String[] args) {
        StaticMethod.method();
        StaticMethod.method(10);
        StaticMethod.method(10,20);

    }
}
