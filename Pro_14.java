/* Create “Bank” package under which create following classes.
1.Create a class “BankAccount” containing accountNo, and balance as data members.
2.Derive the Account class into two classes named “Savings” and “Current”.
3.The “Savings” class should contain a data member named interestRate,
and the “Current” class should contain a data member called overdraftLimit.
4.Create appropriate member functions for all the classes to enable.
functionalities to check balance, deposit, and withdraw amount in Savings.
and Current account.
[Ensure that the BankAccount class cannot be instantiated.]
a subclass constructor invokes the constructor of the super class and instantiate the values.
5. Add exception handling code wherever it requires.
6. Override toString method in every class. */

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