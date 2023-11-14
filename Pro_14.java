package Bank;

import java.util.Scanner;

class BankAccount
{
    protected String accountNo;
    protected double balance;

    public BankAccount()
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
class Savings extends BankAccount
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
class Current extends BankAccount
{
    private double overDraftLimit;

    public Current()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Over Draft Limit : ");
        overDraftLimit = sc.nextDouble();
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
        return super.toString() + "\nOver Draft Limit : " + this.overDraftLimit;
    }
}
class Pro_14 {
    public static void main(String[] args) {
        try {
            Savings s = new Savings();
            System.out.println(s);
            s.deposit(4000);
            s.checkBalance();
            s.withdraw(1000);
            s.checkBalance();

            Current c = new Current();
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}