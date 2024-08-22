public class Employee {
    int employeeID;
    String name;
    String role;
    double hourlyRate;

    Employee(int employeeID, String name, String role, double hourlyRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.role = role;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary(int hoursWorked) {
        double salary = hourlyRate * hoursWorked;
        return salary;
    }
}

class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(int employeeID, String name, String role, double hourlyRate, double monthlySalary) {
        super(employeeID, name, role, hourlyRate);
        // TODO Auto-generated constructor stub
        this.monthlySalary = monthlySalary;
    }

    double getMonthlySalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;

    PartTimeEmployee(int employeeID, String name, String role, double hourlyRate, int hoursWorked) {
        super(employeeID, name, role, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    int getHoursWorked() {
        return hoursWorked;
    }
}

class Contractor extends Employee {
    int contractDuration;
    int workCompletion;

    Contractor(int employeeID, String name, String role, double hourlyRate, int contractDuration, int workCompletion) {
        super(employeeID, name, role, hourlyRate);
        this.contractDuration = contractDuration;
        this.workCompletion = workCompletion;
    }

    int getContractDuration() {
        return contractDuration;
    }
}

class ABC {

    public static void main(String args[]) {
        FullTimeEmployee employee1 = new FullTimeEmployee(2224005, "Akhil", "Full time emplloyee", 100, 50000);
        System.out.println(
                "Salary of FullTime Employee " + (employee1.getMonthlySalary() + employee1.calculateSalary(8 * 30)));

        System.out.println(" ");
        PartTimeEmployee employee2 = new PartTimeEmployee(2224017, "Sarthak", "Part time emplloyee", 250, 10);

        System.out.println("Hours Worked of Part time Employee " + employee2.getHoursWorked());
        System.out.println("Salary of Part time Employee " + employee2.calculateSalary(10 * 30));

        System.out.println(" ");
        Contractor employee3 = new Contractor(2224024, "Vibhavasu", "Contractor", 360, 100, 80);
        System.out.println("Duration of Contract " + employee3.getContractDuration());
        System.out.println("Salary of Contractor "
                + (50000 + employee3.calculateSalary((employee3.contractDuration - employee3.workCompletion) * 8)));
    }
}