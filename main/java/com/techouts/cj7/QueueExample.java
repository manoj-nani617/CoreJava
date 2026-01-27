package com.techouts.collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q =new PriorityQueue<>();
        q.add(10);
        q.add(50);
        q.add(40);
        q.add(2);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);

    }
}
