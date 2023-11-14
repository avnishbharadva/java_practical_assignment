package student;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollno;

    public Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Roll No : ");
        rollno = sc.nextInt();
    }
    public String toString()
    {
        return "\nName : " + name + "\nRoll No : " + rollno;
    }
}