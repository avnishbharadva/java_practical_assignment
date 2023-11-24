/* Create Package “Examination” under which create following class structure.
Write a java program to implement an interface called Exam with a method
Pass (int mark) that returns a boolean. Write another interface called Classify
with a method Division (int average) which returns a String. Write a class
called Result which implements both Exam and Classify. The Pass method should
return true if the mark is greater than or equal to 50 else false. The Division
method must return “First” when the parameter average is 60 or more,
“Second” when average is 50 or more but below 60,
“No division” when average is less than 50.
Add exception handling code wherever it requires.
Override toString method in every class. */

package Examination;

import java.util.Scanner;

interface Exam
{
    boolean Pass(int mark);
}
interface Classify
{
    String Division(int average);
}
class Result implements Exam,Classify
{
    public int mark;
    public int avg;

    public Result()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mark : ");
        mark = sc.nextInt();
        System.out.print("Enter Average : ");
        avg = sc.nextInt();
    }
    public boolean Pass(int mark)
    {
        if(mark >= 50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String Division(int average)
    {
        if(average >= 60)
        {
            return "First";
        }
        else if(average >= 50 && average < 60)
        {
            return "Second";
        }
        else
        {
            return "No Division";
        }
    }
    public String toString()
    {
        return "Mark : " + this.mark + "\nAverage : " + this.avg;
    }
}
class Pro_16 {
    public static void main(String[] args) {
        try {
            Result r = new Result();
            System.out.println(r.Pass(r.mark));
            System.out.println(r.Division(r.avg));
            System.out.println("================================");
            System.out.println(r);
        } catch (Exception e) {
            System.out.println("Error Occured : " + e.getMessage());
        }
    }
}