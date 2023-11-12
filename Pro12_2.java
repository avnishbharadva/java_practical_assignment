package GTU;

import java.util.Scanner;

class Supplier
{
    protected int sup_id;
    protected String sup_name,address;
    protected String pro_name[] = new String[3];
    protected double pro_price[] = new double[3];
    protected double total_price;

    public Supplier()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Supplier ID : ");
        sup_id = sc.nextInt();
        System.out.print("Enter Supplier Name : ");
        sup_name = sc.next();
        System.out.print("Enter Address : ");
        address = sc.next();
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter Product Name " + (i+1) + " : ");
            pro_name[i] = sc.next();
        }
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter Product Price of " + (i+1) + " : ");
            pro_price[i] = sc.nextDouble();
        }
    }
    public void calculate_total_price()
    {
        for(double p : pro_price)
        {
            total_price += p;
        }
    }
    public String toString()
    {
        return "Supplier ID : " + sup_id + "\nSupplier Name : " + sup_name + "\nAddress : " + address + "\nProduct 1 : " + pro_name[0] + "\nProduct 2 : " + pro_name[1] + "\nProduct 3 : " + pro_name[2] + "\nPrice 1 : " + pro_price[0] + "\nPrice 2 : " + pro_price[1] + "\nPrice 3 : " + pro_price[2] + "\nTotal Price : " + total_price; 
    }
}
class Book_supplier extends Supplier
{
    private int discount[] = new int[3];

    public Book_supplier()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter Discount " + (i+1) + " : ");
            discount[i] = sc.nextInt();
        }
    }
    public void calculate_total_price()
    {
        for(int i=0;i<3;i++)
        {
            pro_price[i] = pro_price[i] - (pro_price[i] * discount[i] / 100);
            total_price += pro_price[i];
        }
    }
    public String toString()
    {
        return super.toString() + "\nDiscount 1 : " + discount[0] + "\nDiscount 2 : " + discount[1] + "\nDiscount 3 : " + discount[2];
    }
}
class Pro12_2 {
    public static void main(String[] args) {
        try {
            Book_supplier b = new Book_supplier();

            b.calculate_total_price();

            System.out.println(b);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}