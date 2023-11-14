package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        try {
            B b = new B();
            b.display();
            C c = new C();
            c.display();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }    
}