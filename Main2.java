/* Write a JAVA program which performs the following tasks
Create a package named MyPackage which consists of following classes:
1 A class Person to store information like first name, last name and age. The class must
contain appropriate get, set and display () methods. Create proper constructor.
2 Now Inherit the class Employee from the class Person to store information like employee
ID, designation and salary of the employee. The class must contain appropriate get, set
and display () methods. Create proper constructor
3 Now Inherit the class Student from Person to store information like roll number, address
and percentage of the student. The class must contain appropriate get, set and display ()
methods. Create proper constructor
4 Crete object of Student and Employee class in Test class.
5 Person class must not be instantiate and it contains display() method.
6. Add Exception handling code where ever it required */

package MyPackage1;

import java.util.Scanner;

class Person
{
    private String fname,lname;
    private int age;

    public Person()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        fname = sc.nextLine();
        System.out.print("Enter Last Name : ");
        lname = sc.nextLine();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
    }
    public String getFname()
    {
        return fname;
    }
    public void setFname(String firstname)
    {
        fname = firstname;
    }
    public String getLname()
    {
        return lname;
    }
    public void setLname(String lastname)
    {
        lname = lastname;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int page)
    {
        age = page;
    }
    public void display()
    {
        System.out.println("First Name : " + fname);
        System.out.println("Last Name : " + lname);
        System.out.println("Age : " + age);
    }
}
class Employee extends Person
{
    private int empid;
    private String designation;
    private double salary;

    public Employee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID : ");
        empid = sc.nextInt();
        System.out.print("Enter Designation : ");
        designation = sc.next();
        System.out.print("Enter Salary : ");
        salary = sc.nextDouble();
    }
    public int getEmpid()
    {
        return empid;
    }
    public void setEmpid(int eid)
    {
        empid = eid;
    }
    public String getDesignation()
    {
        return designation;
    }
    public void setDesignation(String desg)
    {
        designation = desg;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double sal)
    {
        salary = sal;
    }
    public void display()
    {
        super.display();
        System.out.println("Empid : " + empid);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
    }
}
class Student extends Person
{
    private int rollno;
    private String address;
    private float percentage;

    public Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No : ");
        rollno = sc.nextInt();
        System.out.print("Enter Address : ");
        address = sc.next();
        System.out.print("Enter Percentage : ");
        percentage = sc.nextFloat();
    }
    public int getRollno()
    {
        return rollno;
    }
    public void setRollno(int rno)
    {
        rollno = rno;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String add)
    {
        address = add;
    }
    public float getPercentage()
    {
        return percentage;
    }
    public void setPercentage(float per)
    {
        percentage = per;
    }
    public void display()
    {
        super.display();
        System.out.println("Roll no : " + rollno);
        System.out.println("Address : " + address);
        System.out.println("Percentage : " + percentage);
    }
}
class Main2 
{
    public static void main(String[] args) {
        try {
            Student s = new Student();
            s.display();

            Employee e = new Employee();
            e.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}