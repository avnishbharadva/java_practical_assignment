/* Create a package named “Mypackage” which consists of following classes:
A class named “Supplier” which has instance variables sup_id, sup_name, address, array of
product_name of size 3 and array of price_of_product of size 3 and total_price. The class
must contain appropriate constructor.
This class has method calculate_total_price() which calculates total price (total_price) of
three Products.
Scan the data from user side.
override toString() method in the class.
Add Exception handling code where ever it required */

package MyPackage;

import java.util.Scanner;

class Supplier
{
    private int sup_id;
    private String sup_name,address;
    private String pro_name[] = new String[3];
    private int price_of_pro[] = new int[3];
    private int total_price;
    
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
            System.out.print("Enter Price of Product " + (i+1) + " : ");
            price_of_pro[i] = sc.nextInt();
        }
    }
    public void calculate_total_price()
    {
        total_price = price_of_pro[0] + price_of_pro[1] + price_of_pro[2];
    }
    public String toString()
    {
        return "Supplier ID : " + sup_id + "\nSupplier Name : " + sup_name + "\nAddress : " + address + "\nProduct 1 Name : " + pro_name[0] + "\nProduct 2 Name : " + pro_name[1] + "\nProduct 3 Name : " + pro_name[2] + "\nPrice of Product 1 : " + price_of_pro[0] + "\nPrice of Product 2 : " + price_of_pro[1] + "\nPrice of Product 3 : " + price_of_pro[2] + "\nTotal Price : " + total_price;
    }
}
class Pro9 {
    public static void main(String[] args) {
        try {
            Supplier s = new Supplier();

            s.calculate_total_price();

            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}