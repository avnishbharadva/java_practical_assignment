package bpack;

import apack.A;

public class B extends A {
    public void display()
    {
        // System.out.println("Private Var of A : " + privateVar);
        System.out.println("Protected Variable of A : " + protectedVar);
        System.out.println("Public Variable : " + publicVar);
    }    
    public String toString()
    {
        return super.toString();
    }
}