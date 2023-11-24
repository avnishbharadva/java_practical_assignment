/* Write the following program.
1. Create a class “Account” containing accountNo, and balance as data members.
2. Derive the Account class into two classes named “Savings” and “Current”. The
“Savings” class should contain a data member named interestRate, and the
“Current” class should contain a data member called overdraftLimit.
3. Create appropriate member functions for all the classes to enable functionalities
to check balance, deposit, and withdraw amount in Savings and Current account.
[Ensure that the Account class cannot be instantiated.]
Scan the data from user side.
4. override toString() method in class.
5. Add Exception handling code where ever it required */

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