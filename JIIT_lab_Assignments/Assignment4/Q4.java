// 4 Create a base class Employee with a method calculateSalary(). Implement subclasses
// FullTimeEmployee, PartTimeEmployee, and ContractEmployee that override this
// method to calculate different types of salaries. Write a program that demonstrates
// polymorphism by calculating the salaries of different types of employees.

class Employee{
    double calculateSalary(){
        return 0;
    }
}
class FullTimeEmployee extends Employee{
    double calculateSalary(){
        double salary=40000.0;
        return salary;
    }
}
class PartTimeEmployee extends Employee{
    double calculateSalary(int days){
        double salary=500*days;
        return salary;
    }
}
class ContractEmployee extends Employee{
    double calculateSalary(int hrs){
        double salary=50*hrs;
        return salary;
    }
}

public class Q4 {
    public static void main(String args[]){
        FullTimeEmployee f1=new FullTimeEmployee();
        PartTimeEmployee p1=new PartTimeEmployee();
        ContractEmployee c1=new ContractEmployee();
        double fullTimeSalary=f1.calculateSalary();
        double partTimeSalary=p1.calculateSalary(20);
        double contractSalary=p1.calculateSalary(180);
        System.out.println("Full time Employee Salary: "+fullTimeSalary);
        System.out.println("Part time Employee Salary: "+partTimeSalary);
        System.out.println("Contract Employee Salary: "+contractSalary);
    }
}
