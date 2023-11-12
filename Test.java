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