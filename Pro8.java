/* Create a package named “MCA” which consists of following classes:
A class named “student” which has instance variables student_id, student_name,
address, array of marks of size 3 and grade. The class must contain appropriate
constructor.
This class has method calculate_grade() which calculates grade.
(After adding array of marks and project marks, if student will get
above 90%, she/he scores A+, above 80%, he scores A, above 70%, he scores B+,
above 60%, he scores B, above 50%, he scores C, else C).
Create a class “Subject” inherit it from student class. the class has instance variables like
subject_id,Subject_name,elective(boolean).
Write appropriate constructors and get() set() methods.
Scan the data from user side.
override toString() method in the class.
Add Exception handling code where ever it required */

package MCA;

import java.util.Scanner;

class Student
{
    private int student_id;
    private String student_name,address;
    private int marks[] = new int[3];
    private String grade;

    public Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID : ");
        student_id = sc.nextInt();
        System.out.print("Enter Student Name : ");
        student_name = sc.next();
        System.out.print("Enter Address : ");
        address = sc.next();
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter Marks of Subject " + i+1 + " : ");
            marks[i] = sc.nextInt();
        }
    }
    public void calculate_grade()
    {
        int total = marks[0] + marks[1] + marks[2];
        double per = total / 3;

        if(per > 90)
        {
            grade = "A+";
        }
        else if(per > 80 && per <= 90)
        {
            grade = "A";
        }
        else if(per > 70 && per <= 80)
        {
            grade = "B+";
        }
        else if(per > 60 && per <= 70)
        {
            grade = "B";
        }
        else if(per > 50 && per <= 60)
        {
            grade = "C";
        }
        else
        {
            grade = "C";
        }
    }
    public String toString()
    {
        return "Student ID : " + student_id + "\nStudent Name : " + student_name + "\nAddress : " + address + "\nMark 1 : " + marks[0] + "\nMark 2 : " + marks[1] + "\nMark 3 : " + marks[2] + "\nGrade : " + grade;  
    }
}
class Subject extends Student
{
    private int subject_id;
    private String subject_name;
    private boolean elective;

    public Subject()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject ID : ");
        subject_id = sc.nextInt();
        System.out.print("Enter Subject Name : ");
        subject_name = sc.next();
        System.out.print("Enter Elective : ");
        elective = sc.nextBoolean();
    }
    public int getSubjectID()
    {
        return this.subject_id;
    }
    public void setSubjectID(int sid)
    {
        this.subject_id = sid;
    }
    public String getSubjectName()
    {
        return this.subject_name;
    }
    public void setSubjectName(String sname)
    {
        this.subject_name = sname;
    }
    public boolean getElective()
    {
        return this.elective;
    }
    public void setElective(boolean ele)
    {
        this.elective = ele;
    }
    public String toString()
    {
        return super.toString() + "\nSubject ID : " + subject_id + "\nSubject Name : " + subject_name + "\nElective : " + elective;
    }
}
class Pro8 {
    public static void main(String[] args) {
        try {
            Subject s = new Subject();

            s.calculate_grade();
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}