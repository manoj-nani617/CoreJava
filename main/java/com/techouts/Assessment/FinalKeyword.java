package com.techouts.Assessment;
/*
   FINAL IS A KEYWORD;
   WHEN YOU DECLARE A VARIABLE WITH FINAL KEYWORD THEN BECOMES THE CONSTANT. THEN THE VALUE OF THE VARIABLE CANNOT BE CHANGED
   WHEN A METHOD DECLARED AS A FINAL THEN THAT METHOD CANNOT OVERRIDE IN CHILD CLASSES.
   WHEN A CLASS IS DECLARED AS A FINAL THEN THAT CLASSED CANNOT BE EXTENDED
*/
public class FinalKeyword {
      final  void method() {
        System.out.println("This ia a final method this cannot be overridden");
    }
    public static void main(String[] args) {
        finalClass f = new finalClass();
        FinalKeyword fk = new FinalKeyword();
        f.fun();
        fk.method();
        System.out.println("This is final variable cannot be change the value " +
                ""+f.a);
    }
}
final class finalClass {    //final class cannot be extended in any child classes
    final int a = 10; // THE VALUE OF THE A CANNOT BE CHANGED IN ANY WHERE OF THE PROGRAM
    void fun() {            //fun method cannot be ovveridden in any child classes.
        System.out.println("This is cannot extended in child class");
    }

}

