package com.techouts.cj4;
class PrivateClass {
    static PrivateClass p;
    private  PrivateClass() {}
    public static PrivateClass getInstance() {
        if(p == null)
            p = new PrivateClass();
        return p;
    }
    void function() {
        System.out.println("This is private constructor method");
    }

}
public class PrivateConstructor {
    public static void main(String[] args) {
        PrivateClass p = PrivateClass.getInstance();
        p.function();


    }
}
