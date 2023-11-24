/* Create Package “Shape” under which create following class structure.
Describe abstract class called Shape which has three subclasses say Triangle,
Rectangle, and Circle. Define one method area () in the abstract class and
override this area () in these three subclasses to calculate for specific
object i.e. area () of Triangle subclass should calculate area of triangle etc.
Same for Rectangle and Circle.
Add exception handling code wherever it requires.
Override toString method in every class. */

package Shape;

import java.util.Scanner;

abstract class Shape
{
    abstract void area();
}
class Triangle extends Shape
{
    private double b,h,area;

    public Triangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base for Triangle : ");
        b = sc.nextDouble();
        System.out.print("Enter Height for Triangle : ");
        h = sc.nextDouble();
    }
    public void area()
    {
        this.area = 0.5 * b * h;
    }
    public String toString()
    {
        return "\nBase : " + b + "\nHeight : " + h + "\nArea : " + area;
    }
}
class Rectangle extends Shape
{
    private double h,w,area;

    public Rectangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height for Rectangle : ");
        h = sc.nextDouble();
        System.out.print("Enter Width for Rectangle : ");
        w = sc.nextDouble();
    }
    public void area()
    {
        this.area = h * w;
    }
    public String toString()
    {
        return "\nWidth : " + w + "\nHeight : " + h + "\nArea : " + area;
    }
}
class Circle extends Shape
{
    private double r,area;

    public Circle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius for Circle : ");
        r = sc.nextDouble();
    }
    public void area()
    {
        this.area = 3.14 * r * r;
    }
    public String toString()
    {
        return "\nRadius : " + r + "\nArea : " + area;
    }
}
class Pro_15 {
    public static void main(String[] args) {
        try {
            Shape s1 = new Triangle();
            s1.area();
            System.out.println(s1);

            Shape s2 = new Rectangle();
            s2.area();
            System.out.println(s2);

            Shape s3 = new Circle();
            s3.area();
            System.out.println(s3);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}