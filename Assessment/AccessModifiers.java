package com.techouts.Assessment;

public class AccessModifiers {
    private int a = 10;
    int b = 20;            // default
    protected int c = 30;
    public int d = 40;

    public void show() {
        System.out.println(a); // private – accessible here
    }
  void display() {
      AccessModifiers obj = new AccessModifiers();

      // System.out.println(obj.a);  private – not accessible
      System.out.println(obj.b);   // ✔ default
      System.out.println(obj.c);   // ✔ protected
      System.out.println(obj.d);   // ✔ public
  }
}
class Main {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.show();
        obj.display();
    }
}