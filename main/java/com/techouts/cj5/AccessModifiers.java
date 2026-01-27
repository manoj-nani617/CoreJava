package com.techouts.cj5;

import com.sun.security.jgss.GSSUtil;

//Public members can be accessed from anywhere
// No restrictions
 class PublicMembers {
    public int x = 10;

    public void show() {
        System.out.println("Public method");
    }
}

//Protected members can be with in the packages and in child classes
class ProtectedMembers {
    protected int x = 20;
}

// Default members can be accessed with in the same package
// No keyword is used to default members
class DefaultMembers {
    int y = 30; // default access
}

// Private members can be accessed with in the class
class PrivateMembers {
    private int z = 40;
    int getZ() {
        return z;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        PrivateMembers pr = new PrivateMembers();
        System.out.println(pr.getZ());
        ProtectedMembers pro = new ProtectedMembers();
        System.out.println(pro.x);
        DefaultMembers d = new DefaultMembers();
        System.out.println(d.y);
        PublicMembers pu = new PublicMembers();
        System.out.println(pu.x);
    }


}
