/* Write a JAVA program which performs the following tasks
Create a package named “geometry” which consists of following classes. An abstract class
named “figure” which has final variable PI. The class should also contain abstract method
called area () and perimeter ().
Another class called “Rectangle” which is derived from “figure” class. It has instance
variable width and length. The class should also contain parameterized constructor named
“Rectangle”. It should also override method area () [(width*length)].
Another class called “Circle” which is derived from “figure” class. Also, it has extra instance
variable radius. The class should also contain parameterized constructor named Circle.
It should also override method area () [PI* radius*radius] and perimeter () [2*PI*radius].
Create a class Test (class which has main ()) to perform required operation by getting
values for “Rectangle” and “Circle” objects based on your input choice.

Create four references of “figure” class which refer “Rectangle” and “Circle” objects based
on input choice (“C” for circle/ “R” for “Rectangle”).
Call area () for all four objects and perimeter () only for “circle” objects and also display
area and perimeter of the objects.
Create a package “shape” in which “Circle” and “Test” are declared.
There are two packages.
1st package “geometry” contains “figure” and “Circle”,
2nd package “shape” contains “Rectangle” and “Test”.
Add Exception handling code where ever it required */

package Geometry;

import java.util.Scanner;

abstract class Figure
{
    double PI = 3.14d;

    abstract double area();
    abstract double perimeter();
}

class Circle extends Figure
{
    private double radius;

    public Circle(double r)
    {
        this.radius = r;
    }
    public double area()
    {
        return PI*this.radius*this.radius;
    }
    public double perimeter()
    {
        return 2*PI*this.radius;
    }
}
class Rectangle extends Figure {
    private double length, width;

    public Rectangle(double len, double wid) {
        this.length = len;
        this.width = wid;
    }

    public double area() {
        return this.length * this.width;
    }

    public double perimeter() {
        return 2 * (this.length * this.width);
    }
}

class Test {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Length for Rectangle : ");
            double l = sc.nextDouble();
            System.out.print("Enter Width for Rectangle : ");
            double w = sc.nextDouble();
            Figure f1;
            Rectangle r = new Rectangle(l, w);
            f1 = r;
            System.out.println("Area of Rectangle : " + f1.area());
            System.out.println("Perimeter of Rectangle : " + f1.perimeter());

            System.out.println("====================================");

            System.out.print("Enter Radius for Circle : ");
            double ra = sc.nextDouble();
            Figure f2;
            Circle c = new Circle(ra);
            f2 = c;
            System.out.println("Area of Circle : " + f2.area());
            System.out.println("Perimeter of Circle : " + f2.perimeter());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}