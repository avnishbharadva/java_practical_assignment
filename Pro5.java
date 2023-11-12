package MyPackage;

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
    public int getMark()
    {
        return mark;
    }
    public void setMark(int m)
    {
        this.mark = m;
    }
    public int getAverage()
    {
        return avg;
    }
    public void setAverage(int a)
    {
        this.avg = a;
    }
    public boolean Pass(int mark)
    {
        if(mark >= 50){
            return true;
        }
        else{
            return false;
        }
    }
    public String Division(int average)
    {
        if(average >= 60){
            return "First";
        }
        else if(average >= 50 && average < 60){
            return "Second";
        }
        else{
            return "No Division";
        }
    }
    public String toString()
    {
        return "Mark : " + this.mark + "\nAverage : " + this.avg;
    }
}
class Pro5 
{
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