package com.techouts.Assessment3;

import java.util.Vector;

interface Vehicle {
    void drive();
}
interface Parent {
    void work(int a);
}
interface Lecturer {
    void teaching(int a, int b);
}
interface Student {
    void study(int a, int b, int c);
}
public class LambdaExpressionWithMultipleParameters {
    public static void main(String[] args) {
        Vehicle v = () -> System.out.println("This is the lambda Expression with single parameter");
        Parent p = i -> System.out.println("This is the lambda Expression with single parameter "+i);
        Lecturer l = (i,j) -> System.out.println("This is the lambda Expression with single parameter "+i+" "+j);
        Student s = (i,j,k) -> System.out.println("This is the lambda Expression with single parameter "+i+" "+j+" "+k);

        v.drive();
        p.work(10);
        l.teaching(10,20);
        s.study(10,20,30);
    }
}
