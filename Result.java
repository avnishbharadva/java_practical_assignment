package Exam;

import java.util.Scanner;

import student.Student;

public class Result extends Student{
    private int marks[] = new int[3];
    private int total;
    private double percentage;
    private String grade;

    public Result()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter Mark " + (i+1) + " : ");
            marks[i] = sc.nextInt();
        }
    }
    public void calcResult()
    {
        total = marks[0] + marks[1] + marks[2];
        percentage = total / 3;

        if(percentage >= 90 && percentage <= 100)
        {
            grade = "A+";
        }
        else if(percentage >= 80 && percentage <= 90)
        {
            grade = "A";
        }
        else if(percentage >= 70 && percentage <= 80)
        {
            grade = "B+";
        }
        else if(percentage >= 60 && percentage <= 70)
        {
            grade = "B";
        } 
        else
        {
            grade = "C";
        }
    }
    public String toString()
    {
        return "\nMark 1 : " + marks[0] + "\nMark 2 : " + marks[1] + "\nMark 3 : " + marks[2] + "\nTotal : " + total + "\nPercentage : " + percentage + "\nGrade : " + grade;
    }
}