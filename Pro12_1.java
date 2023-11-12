import java.util.Scanner;

class NegativeTotalAmountException extends Exception
{
    public NegativeTotalAmountException(String msg)
    {
        super(msg);
    }
}
class Bill {
    private int bill_id;
    private int no_items;
    private double item_price[];
    private double total_amount;

    public Bill() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bill ID : ");
        bill_id = sc.nextInt();
        System.out.print("Enter Total No Items : ");
        no_items = sc.nextInt();
        item_price = new double[no_items];
        for (int i = 0; i < no_items; i++) {
            System.out.print("Enter Price of Item " + (i + 1) + " : ");
            item_price[i] = sc.nextDouble();
        }
    }

    public void calculate_total_amount() throws NegativeTotalAmountException {
        for (int i = 0; i < item_price.length; i++) {
            total_amount += item_price[i];
        }
        if(total_amount < 0){
            throw new NegativeTotalAmountException("Total Amount can't be Negative");
        }
    }

    public String toString() {
        return "Bill ID : " + bill_id + "\nTotal no of Items : " + no_items + "\nTotal Amount : " + total_amount;
    }
}

class Pro12_1 {
    public static void main(String[] args) {
        try {
            Bill b = new Bill();

            b.calculate_total_amount();

            System.out.println(b);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}