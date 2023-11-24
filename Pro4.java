/* Create a package named MyPackage which consists of following classes: 

1. Describe abstract class called Shape which has three subclasses.
Triangle, Rectangle, and Circle.
2.Define one method area () in the abstract class and override this area () in these three
subclasses to calculate for specific object i.e. area () of Triangle subclass should calculate
area of triangle etc. Same for Rectangle and Circle.
3. Override toString() method for all classes.
4. access the object of all class from the reference variable of shape class.
5. Add Exception handling code where ever it required */

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