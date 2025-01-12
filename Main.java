package git;
import java.util.ArrayList;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    // Constructor
    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Override toString to display employee details
    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", designation='" + designation + '\'' +
               ", salary=" + salary +
               '}';
    }
}

class EmployeeManager {
    private ArrayList<Employee> employees;

    // Constructor
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    // Add an employee to the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Display all employees
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class SecretKey {
    private static final String SECRET_KEY = "UTHANTHA";

    // Method to get the secret key
    public static String getSecretKey() {
        return SECRET_KEY;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an EmployeeManager instance
        EmployeeManager manager = new EmployeeManager();

        // Initialize employees
        Employee emp1 = new Employee(1, "Tashi", "Developer", 11111);
        Employee emp2 = new Employee(2, "Abjit", "Manager", 22222);

        // Add employees to the manager
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        // Display employee information
        System.out.println("Employee List:");
        manager.displayEmployees();

        // Demonstrate the use of SecretKey (if needed)
        System.out.println("Secret Key: " + SecretKey.getSecretKey());
    }
}
