import java.util.Scanner;

class Account
{
    protected String accountNo;
    protected double balance;

    public Account()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account No : ");
        accountNo = sc.next();
        System.out.print("Enter Balance : ");
        balance = sc.nextDouble();
    }

    public String toString()
    {
        return "Account No : " + this.accountNo + "\nBalance : " + this.balance;
    }
}
class Savings extends Account
{
    private double interestRate;

    public Savings()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Interest Rate : ");
        interestRate = sc.nextDouble();
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    public void checkBalance()
    {
        System.out.println("Saving Account Balance : " + this.balance);
    }
    public String toString()
    {
        return super.toString() + "\nInterest Rate : " + this.interestRate;
    }
}
class Current extends Account
{
    private double overdraftLimit;

    public Current()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Over Draft Limit : ");
        overdraftLimit = sc.nextDouble();
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    public void checkBalance()
    {
        System.out.println("Current Account Balance : " + this.balance);
    }
    public String toString()
    {
        return super.toString() + "\nOver Draft Limit : " + this.overdraftLimit;
    }
}
class Pro6 {
    public static void main(String[] args) {
        try {
            System.out.println("Saving Account Details : ");
            Savings s = new Savings();
            s.deposit(3500);
            s.withdraw(5000);
            s.checkBalance();
            System.out.println(s);
            System.out.println("=============================");
            System.out.println("Current Account Details : ");
            Current c = new Current();
            s.deposit(1000);
            s.withdraw(2000);
            s.checkBalance();
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}