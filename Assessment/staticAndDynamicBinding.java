package com.techouts.Assessment;

class Parent {
    static void method() {
        System.out.println("Parent Method");
    }
}
class Child extends Parent {
    static void method() {
        System.out.println("This is the child Method");
    }

}
public class staticAndDynamicBinding {
    public static void main(String[] args) {
        Parent p =  new Child(); // static binding
        p.method();
        DynamicBinding d = new binding();
        d.show();
    }
}

 class DynamicBinding {
    void show() {
        System.out.println("Parent show method");
    }
}

class binding extends DynamicBinding {
    @Override
    void show() {
        System.out.println("Child show method");
    }
}
