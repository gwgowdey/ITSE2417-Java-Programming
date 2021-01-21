// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 9.

/*
Assignment:
Suppose the class Employee is declared as follows:

public class Employee
{
	private String name;
	private double baseSalary;
			  
    public void setName(String newName) { . . . }
    public void setBaseSalary(double newSalary) { . . . }
	public String getName() { . . . }
    public double getSalary() { . . . }
}

Declare a class Manager that inherits from the class Employee and 
adds an instance variable bonus for storing a salary bonus. Implement 
the constructors and methods, and supply a test program.
*/

public class Lesson9
{
    // Illustrate class construction and inheritance.
    class Employee
    {

        private String name;
        private double baseSalary;

        public Employee() 
        {
            name = "";
            baseSalary = 0.00;
        } 

        public Employee(String name, double baseSalary) 
        {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        public void setName(String newName)
        {
            name = newName;
        }

        public void setBaseSalary(double newSalary)
        {
            baseSalary = newSalary;
        }

        public String getName()
        {
            return name;
        }

        public double getSalary()
        {
            return baseSalary;
        }
    }

    class Manager extends Employee
    {

        private double bonus;

        public Manager(String newName, double newSalary, double newBonus)
        {
            super(newName,newSalary);
            /* 
            Or call the setters separately:
            setName(newName);
            setBaseSalary(newSalary);
            */
            bonus = newBonus;
        }

        public double getBonus()
        {
            return bonus;
        }

        public void setBonus(double bonus)
        {
            this.bonus = bonus;
        }
    }

    public class EmployeeTest
    {
        // @param args the command line arguments.
        public static void main(String[] args)
        {
            // Creating an employee.
            Employee employee = new Employee();
            employee.setName("Griffin Gowdey");
            employee.setBaseSalary(23000.00);
            Manager manager = new Manager("New Manager", 25000, 3000);
            System.out.printf("Employee %s makes $%4.2f.\n", employee.getName(), employee.getSalary());
            System.out.printf("Manager %s makes $%4.2f and a bonus of $%10.2f.\n",
                manager.getName(), manager.getSalary(), manager.getBonus());
        }
    }
}