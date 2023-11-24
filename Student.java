/* Assume that there are two packages, student, and exam. A student package.
contains Student class and the exam package contains Result class.
Write a program that generates mark sheet for students.
Add exception handling code wherever it requires.
Override toString method in every class. */

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