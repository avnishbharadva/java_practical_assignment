/* Create a package named MyPackage which consists of following classes:
1. Create a class “Rectangle” that would contain length and width as data members.
2. Define constructors [constructor overloading (default, parameterized and copy)] to
initialize the data members.
3. Define the member functions to find area and to display the number of objects created.
[Note: define initializer block, static initializer block and the static data member and
member function. Also demonstrate the sequence of execution of initializer block and
static initializer block]
4. Override toString() method in every class.
5. Add Exception handling code where ever it required */

package MyPackage;

class Rectangle
{
    private double length,width,area;
    static int count = 0;

    public Rectangle()
    {
        System.out.println("Default Constructor Called...");
        this.length = 0.0;
        this.width = 0.0;
    }
    public Rectangle(double len,double wid)
    {
        System.out.println("Parameterized Constructor Called...");
        this.length = len;
        this.width = wid;
    }
    public Rectangle(Rectangle rect)
    {
        System.out.println("Copy Constructor Called...");
        this.length = rect.length;
        this.width = rect.width;
    }

    static
    {
        System.out.println("Static Initializer Block Called...");
    }
    {
        System.out.println("Initializer Block Called...");
        count++;
    }
    public void findArea()
    {
        System.out.println("Find Area Method Called...");
        this.area = this.length * this.width;
    }
    public String toString()
    {
        return "Length : " + this.length + "\nWidth : " + this.width + "\nArea : " + this.area + "\nTotal Objects Created : " + count; 
    }
}
class Pro3 {
    public static void main(String[] args) {
        try {
            Rectangle r1 = new Rectangle();
            System.out.println(r1);

            Rectangle r2 = new Rectangle(23.12d,56.43d);
            r2.findArea();
            System.out.println(r2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}