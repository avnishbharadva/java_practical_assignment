package MyPackage;

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
    private int arr[] = new int[3];
    private int avg;
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
}
class Pro5 
{
    
}