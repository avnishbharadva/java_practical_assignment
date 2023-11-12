package MyPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person {
    public String fname, mname, lname, address;
    public int age;

    public void setFname(String firstname) {
        fname = firstname;
    }

    public String getFname() {
        return fname;
    }

    public void setMname(String middlename) {
        mname = middlename;
    }

    public String getMname() {
        return mname;
    }

    public void setLname(String lastname) {
        lname = lastname;
    }

    public String getLname() {
        return lname;
    }

    public void setAdress(String add) {
        address = add;
    }

    public String getAdress() {
        return address;
    }

    public void setAge(int page) {
        age = page;
    }

    public int getAge() {
        return age;
    }

    public void inputdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        fname = sc.nextLine();
        System.out.print("Enter Middle Name : ");
        mname = sc.nextLine();
        System.out.print("Enter Last Name : ");
        lname = sc.nextLine();
        System.out.print("Enter Address : ");
        address = sc.nextLine();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
    }
    public void displaydata()
    {
        System.out.println("First Name : " + fname);
        System.out.println("Middle Name : " + mname);
        System.out.println("Last Name : " + lname);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
    }
}

class Student extends Person implements Comparable<Student> {
    public int rollno;
    public String division, dateOfBirth;

    public void inputdata()
    {
        super.inputdata();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No : ");
        rollno = sc.nextInt();
        System.out.print("Enter Division : ");
        division = sc.next();
        System.out.print("Enter Date of Birth : ");
        dateOfBirth = sc.next();
    }

    public String toString() {
        return "Firstname : " + fname + "\nMiddlename : " + mname + "\nLastname : " + lname + "\nAddress : " + address
                + "\nAge : " + age + "\nRollno : " + rollno + "\nDivision : " + division + "\nDateOfBirth : "
                + dateOfBirth;
    }

    public int compareTo(Student s) {
        return Integer.compare(rollno, s.rollno);
    }
}

class Employee extends Person implements Comparable<Employee>{
    public int empid;
    public double da, hra, netsal;

    public void inputdata()
    {
        super.inputdata();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Emp ID : ");
        empid = sc.nextInt();
        System.out.print("Enter DA : ");
        da = sc.nextDouble();
        System.out.print("Enter HRA : ");
        hra = sc.nextDouble();
        System.out.print("Enter Net Salary : ");
        netsal = sc.nextDouble();
    }
    public String toString() {
        return "Firstname : " + fname + "\nMiddlename : " + mname + "\nLastname : " + lname + "\nAddress : " + address
                + "\nAge : " + age + "\nEmp ID : " + empid + "\nDA : " + da + "\nHRA : " + hra + "\nNet Salary : "
                + netsal;
    }
    public int compareTo(Employee e) {
        return Double.compare(netsal, e.netsal);
    }
}

class Main1 
{
    public static void main(String[] args) 
    {
        try {
            ArrayList<Student> studentlist = new ArrayList<>();

            for(int i=0;i<5;i++){
                Student s = new Student();
                s.inputdata();
                studentlist.add(s);
                System.out.println("==============================");
            }

            Collections.sort(studentlist);
            for(Student s : studentlist){
                System.out.println(s);
                System.out.println("=============================");
            }

            ArrayList<Employee> emplist = new ArrayList<>();

            for(int i=0;i<5;i++){
                Employee e = new Employee();
                e.inputdata();
                emplist.add(e);
                System.out.println("==============================");
            }

            Collections.sort(emplist);
            for(Employee e : emplist){
                System.out.println(e);
                System.out.println("=============================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}