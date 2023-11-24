/* Write a JAVA program which performs the following tasks
i) Declare a class “Amazon_item” which has instance variable
item_id (int), product_type( Textile/shoe/cosmetics), item_name (String),
Methods: item_display_price (int), item_net_price (int).
This class has appropriate constructors, abstract methods
calculate_net_price() and display_price().
ii) Declare 2nd class “cloth_item” derived from “Amazon_item”
which has extra instance variable texture_type
(Cotton/silk/synthetic).

It has overridden methods with same prototype and parameterized
constructors.
calculate_net_price() method calculates final discounted selling price, that
much amount, customer has to pay.
(if price value is more than 5000/-, discount will be 15% from
item_display_price.
if price value is more than 4000/-, discount will be 10% from
item_display_price,
if price value is more than 3000/-, discount will be 5% from
item_display_price,
else No discount).
display() method displays all data of a “cloth_item” objects.
iii) Declare 3rd “main_application” class which declares two
“Amazon_item” object references which refer to “cloth_item”
objects.
Call appropriate constructors for two cloth_item objects.
Accept item_id, product_type, item_name and item_display_price from
keyboard for 2 objects.
Calculate item_net_price for these two “cloth_item” objects and display their
data including their net_price (final discounted selling price).
Add Exception handling code where ever it required
Override toString method in every class. */

import java.util.Scanner;

abstract class Amazon_item
{
    protected int item_id;
    protected String product_type,item_name;
    protected double itemDisplayPrice,itemNetPrice;
    
    public Amazon_item(int iid,String ptype,String iname,double idprice)
    {
        this.item_id = iid;
        this.product_type = ptype;
        this.item_name = iname;
        this.itemDisplayPrice = idprice;
    }
    public void item_display_price(double price)
    {
        this.itemDisplayPrice = price;
    }
    public void item_net_price(double price)
    {
        this.itemNetPrice = price;
    }
    abstract void calculate_net_price();
    abstract void display_price();
}
class Cloth_item extends Amazon_item
{
    private String texture_type;

    public Cloth_item(int iid,String ptype,String iname,double idprice,String ttype)
    {
        super(iid, ptype, iname, idprice);
        this.texture_type = ttype;
    }
    public void calculate_net_price()
    {
        if(itemDisplayPrice > 5000)
        {
            itemNetPrice = itemDisplayPrice - (itemDisplayPrice * 0.15);
        }
        else if(itemDisplayPrice > 4000 && itemDisplayPrice <= 5000)
        {
            itemNetPrice = itemDisplayPrice - (itemDisplayPrice * 0.10);
        }
        else if(itemDisplayPrice > 3000 && itemDisplayPrice <= 4000)
        {
            itemNetPrice = itemDisplayPrice - (itemDisplayPrice * 0.05);
        }
        else
        {
            itemNetPrice = itemDisplayPrice;
        }
    }
    public void display_price()
    {
        System.out.println("Display Price : " + itemDisplayPrice);
    }
    public String toString()
    {
        return "Item ID : " + item_id + "\nProduct Type : " + product_type + "\nItem Name : " + item_name + "\nItem Display Price : " + itemDisplayPrice + "\nItem Net Price : " + itemNetPrice + "\nTexture Type : " + texture_type; 
    }
}
class Main_Application 
{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Details for Cloth Item 1");
            System.out.print("Enter Item ID : ");
            int iid = sc.nextInt();
            System.out.print("Enter Product Type : ");
            String ptype = sc.next();
            System.out.print("Enter Item Name : ");
            String iname = sc.next();
            System.out.print("Enter Item Display Price : ");
            double idprice = sc.nextDouble();
            System.out.print("Enter Texture Type : ");
            String ttype = sc.next();

            Amazon_item ref = new Cloth_item(iid, ptype, iname, idprice, ttype);
            ref.calculate_net_price();
            System.out.println(ref);

            System.out.println("====================================");
            System.out.println("Enter Details for Cloth Item 2");
            System.out.print("Enter Item ID : ");
            iid = sc.nextInt();
            System.out.print("Enter Product Type : ");
            ptype = sc.next();
            System.out.print("Enter Item Name : ");
            iname = sc.next();
            System.out.print("Enter Item Display Price : ");
            idprice = sc.nextDouble();
            System.out.print("Enter Texture Type : ");
            ttype = sc.next();

            Amazon_item ref2 = new Cloth_item(iid, ptype, iname, idprice, ttype);
            ref2.calculate_net_price();
            System.out.println(ref2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }  
}