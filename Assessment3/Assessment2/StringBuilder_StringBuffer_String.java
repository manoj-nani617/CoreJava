package com.techouts.Assessment2;

public class StringBuilder_StringBuffer_String {
//    String Builder are the mutable class which can be used to create and modify the strings not synchronized, not thread safe. StringBuilder are fast
//    String Buffer are the mutable class which can be used to create and modify the strings  synchronized, thread safe. StringBuilder are slow
//    Strings are the immutable class which can be used to create  the strings  synchronized, thread safe.
public static void main(String[] args) {
    String s = new String("Apple");
    StringBuilder sb = new StringBuilder("Banana");
    StringBuffer sbf = new StringBuffer("Cat");

//    s.append() not allowed
    sb.append("fruit");
    sbf.append("fruit");

//    s.insert() not allowed
    sb.insert(0, "Dragon");
    sbf.insert(0, "Dragon");

//    s.delete()   not allowed
    sb.delete(1,2);
    sbf.delete(1,2);

//    Read
    System.out.println(sb);
    System.out.println(sbf);
    System.out.println(s);
}

}
