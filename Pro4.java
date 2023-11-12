package MyPackage1;

abstract class Shape
{
    abstract void area();
}
class Triangle extends Shape
{
    private double b,h;
    
    public Triangle(double b,double h)
    {
        this.b = b;
        this.h = h;
    }
    public void area()
    {
        System.out.println("Area of Triangle : " + ((b*h)/2));
    }
    public String toString()
    {
        return "Base : " + this.b + "\nHeight : " + this.h;
    }
}
class Rectangle extends Shape
{
    private double l,w;

    public Rectangle(double l,double w)
    {
        this.l = l;
        this.w = w;
    }
    public void area()
    {
        System.out.println("Area of Rectangle : " + (l*w));
    }
    public String toString()
    {
        return "Length : " + this.l + "\nWidth : " + this.w;
    }
}
class Circle extends Shape
{
    private double r;

    public Circle(double r)
    {
        this.r = r;
    }
    public void area()
    {
        System.out.println("Area of Circle : " + (3.14*r*r));
    }
    public String toString()
    {
        return "Radius : " + r;
    }
}
public class Pro4 
{
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(10,5);
            Shape s = t;
            s.area();
            System.out.println(t);

            Rectangle r = new Rectangle(50, 40);
            s = r;
            s.area();
            System.out.println(r);

            Circle c = new Circle(9);
            s = c;
            s.area();
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error Occured : " + e.getMessage());
        }
    }    
}