import java.util.Scanner;

class Bank_account {
    private String account_id, mobile_number, account_holder_name, account_type;
    private double account_balance, credit_limit;

    public Bank_account() {
        this.account_id = null;
        this.mobile_number = null;
        this.account_holder_name = null;
        this.account_type = null;
        this.account_balance = 0.0d;
        this.credit_limit = 0.0d;
    }

    public Bank_account(String aid, String mnum, String ahname, String atype, double abal, double cl) {
        this.account_id = aid;
        this.mobile_number = mnum;
        this.account_holder_name = ahname;
        this.account_type = atype;
        this.account_balance = abal;
        this.credit_limit = cl;
    }

    public void update_account(double amount) {
        this.account_balance += amount;
    }

    public String toString() {
        return "Account ID : " + account_id + "\nMobile Number : " + mobile_number + "\nAccount Holder Name : "
                + account_holder_name + "\nAccount Type : " + account_type + "\nAccount Balance : " + account_balance
                + "\nCredit Limit : " + credit_limit;
    }
}

class Pro_11 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            Bank_account accounts[] = new Bank_account[3];

            for (int i = 0; i < 3; i++) 
            {
                System.out.println("Enter details for account " + (i + 1));

                System.out.print("Enter Account ID: ");
                String accountId = sc.next();
                System.out.print("Enter Mobile Number: ");
                String mobileNumber = sc.next();
                System.out.print("Enter Account Holder Name: ");
                String accountHolderName = sc.next();
                System.out.print("Enter Account Type: ");
                String accountType = sc.next();
                System.out.print("Enter Account Balance: ");
                double accountBalance = sc.nextDouble();
                System.out.print("Enter Credit Limit: ");
                double creditLimit = sc.nextDouble();

                accounts[i] = new Bank_account(accountId, mobileNumber, accountHolderName, accountType, accountBalance, creditLimit);

                System.out.println();
                System.out.println(accounts[i]);
                System.out.println("======================================");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}