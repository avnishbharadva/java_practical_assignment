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