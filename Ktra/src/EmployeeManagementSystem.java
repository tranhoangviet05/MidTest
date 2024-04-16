import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main class to test the implementation
public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        Scanner scanner = new Scanner(System.in);
        
        int option;

        do {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");
            option = Integer.parseInt(scanner.nextLine());
            
        switch(option){
            case 1:   
                // Prompt for employee information
                System.out.println("Enter employee information:");
                
                System.out.print("ID: ");
                String id = scanner.nextLine();

                System.out.print("Full Name: ");
                String fullName = scanner.nextLine();

                System.out.print("Birth Day: ");
                String birthDay = scanner.nextLine();

                System.out.print("Phone: ");
                String phone = scanner.nextLine();

                System.out.print("Email: ");
                String email = scanner.nextLine();

                System.out.print("Employee Type (Experience/Fresher/Intern): ");
                String employeeType = scanner.nextLine();

                if (employeeType.equalsIgnoreCase("Experience")) {
                    System.out.print("Experience in years: ");
                    int expInYear = Integer.parseInt(scanner.nextLine());

                    System.out.print("Professional skill: ");
                    String proSkill = scanner.nextLine();

                    // Create experience employee
                    Experience employee = new Experience(id, fullName, birthDay, phone, email, employeeType, expInYear, proSkill);
                    system.addEmployee(employee);
                } else if (employeeType.equalsIgnoreCase("Fresher")) {
                    System.out.print("Graduation date: ");
                    String graduationDate = scanner.nextLine();

                    System.out.print("Graduation rank: ");
                    String graduationRank = scanner.nextLine();

                    System.out.print("Education: ");
                    String education = scanner.nextLine();

                    // Create fresher employee
                    Fresher employee = new Fresher(id, fullName, birthDay, phone, email, employeeType, graduationDate, graduationRank, education);
                    system.addEmployee(employee);
                } else if (employeeType.equalsIgnoreCase("Intern")) {
                    System.out.print("Majors: ");
                    String majors = scanner.nextLine();

                    System.out.print("Semester: ");
                    String semester = scanner.nextLine();

                    System.out.print("University name: ");
                    String universityName = scanner.nextLine();

                    // Create intern employee
                    Intern employee = new Intern(id, fullName, birthDay, phone, email, employeeType, majors, semester, universityName);
                    system.addEmployee(employee);
                } else {
                    System.out.println("Invalid employee type. Employee not created.");
                }
                break;
            case 2:
                System.out.print("Enter the ID of the employee to remove: ");
                int index = Integer.parseInt(scanner.nextLine());
                if (index >= 0 && index < system.employees.size()) {
                    Employee employeeToRemove = system.employees.get(index);
                    system.removeEmployee(employeeToRemove);
                } else {
                    System.out.println("Invalid employee index.");
                }
                break;
            case 3:
                system.displayAllEmployees();
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
            }

            System.out.println();
        } while (option != 4);
        
        // Display all employees
        system.displayAllEmployees();

        scanner.close();
        
    }
}