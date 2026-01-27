package com.techouts.cj8;

class Array <T>{
    void method() {
        System.out.println("this is the method");
    }
    T method2(T value) {
        System.out.println("This is the generic method");
        return value;

    }
}
public class GenericsExample {
    public static void main(String[] args) {
    Array<String> t = new Array<>();
    t.method();

    Array<Integer> st = new Array<>();
    st.method();
     System.out.println(st.method2(10));

    }
}
