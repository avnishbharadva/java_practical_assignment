/* Write a JAVA program to perform the following.
Create “Person” package under which create following classes.
i) Declare an abstract class “Person”. Instance variables are as below:
name – String
salary – double
Methods are as follows:
Overloaded constructors
Abstract method: hike_Salary(double percentage)
Display_data()
ii) Declare class “Employee” which is inherited from “Person”.
Override hike_Salary(double percentage): method in this class
such that the employee’s salary is incremented by percentage
which is passed as parameter.
Throw exception if percentage which is passed, is negative.
iii) Declare class “Manager” which is inherited from “Employee”.
Override hike_Salary(double percentage) method such that manager’s salary
is incremented by the percentage passed as parameter and additional 5000 is
added as bonus.
iv) Declare “Application_per” class. Within this class, declare
Person array.
Create objects of “Employee”, “Manager” and store the references of objects
into above mentioned array.
Call hike_Salary(double percentage) method and display_data() for all
objects.
Add Exception handling code wherever it required
V) Override toString method in every class. */

package Person;

class NegativePercentageException extends Exception {
    public NegativePercentageException(String msg) {
        super(msg);
    }
}

abstract class Person {
    String name;
    double salary;

    public Person() {
        this.name = null;
        this.salary = 0.0d;
    }

    public Person(String nm, double sal) {
        this.name = nm;
        this.salary = sal;
    }

    abstract void hike_salary(double percentage) throws NegativePercentageException;

    abstract void display_data();
}

class Employee extends Person {

    public Employee(String name,double salary)
    {
        super(name, salary);
    }
    void hike_salary(double percentage) throws NegativePercentageException {
        if(percentage < 0)
        {
            throw new NegativePercentageException("Percentage Can't be Negative");
        }
        else
        {
            this.salary += (this.salary * percentage) / 100;        
        }
    }

    void display_data() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
    }
    public String toString()
    {
        return "\nEmployee Name : " + name + "\nEmployee Salary : " + salary;
    }
}
class Manager extends Employee
{
    public Manager(String name,double salary)
    {
        super(name, salary);
    }
    void hike_salary(double percentage) throws NegativePercentageException {
        if(percentage < 0)
        {
            throw new NegativePercentageException("Percentage Can't be Negative");
        }
        else
        {
            this.salary += ((this.salary * percentage) / 100) + 5000;        
        }
    }
    public String toString()
    {
        return "\nManager Name : " + name + "\nManager Salary : " + salary;
    }
}
class Application_per {
    public static void main(String[] args) {
        try {
            Person p[] = new Person[3];

            p[0] = new Employee("Emp1",4900);
            p[1] = new Manager("Manager1",10000);
            p[2] = new Employee("Emp2", 7500);

            for(Person per : p)
            {
                per.display_data();
            }

            for(Person per : p)
            {
                per.hike_salary(20);
            }

            for(Person per : p)
            {
                System.out.println(per);
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}