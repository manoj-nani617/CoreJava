package com.techouts.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        Stack is a heap of objects placed one over the other.
//        Stack follows last in first out principle
//        The element which is added first and that element will be removed first.
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);

//        Accessing through ForEach
        for(int i : s)
            System.out.print(i+"\t");
        System.out.println();

//        Accessing through lambda
        s.forEach(i -> System.out.print(i+"\t"));
        System.out.println();

//        Update
        s.set(0,100);
        System.out.println(s);

        s.pop();
        s.pop();
        s.pop();
    }
}
