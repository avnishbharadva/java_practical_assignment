package apack;

public class A {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;

    public String toString()
    {
        return "\nPrivate Variable : " + privateVar + "\nProtected Variable : " + protectedVar + "\nPublic Variable : " + publicVar; 
    }    
}