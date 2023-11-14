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