// Write a Java program to manage a collection of employees using the legacy class
// Vector. Each employee has a name, ID, and salary. Use a custom Comparator to sort
// the employees by salary in descending order.

// Requirements:

// Store the employees in a Vector.
// Implement a custom Comparator to sort the employees by their salary in
// descending order.
// Display the list of employees before and after sorting.
import java.util.*;
class Employee{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    } 
}
public class Q2 {
    Employee inputEmployee(int i){
        System.out.println("Enter the Employee Details of"+(i+1));
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id: ");
        int id=sc.nextInt();
        System.out.println("Enter name: ");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Enter salary: ");
        double salary=sc.nextDouble();

        Employee e=new Employee(id, name, salary);
        return e;
    }
    Vector<Employee> inputVector(int n){
        Vector<Employee> list=new Vector<>();
        for(int i=0;i<n;i++){
            Employee e=inputEmployee(i);
            list.add(e);
        }
        return list;
    }
    void displayVector(Vector<Employee> list, int n) {
        for(int i = 0; i < n; i++) {
            int id = list.get(i).id;
            String name = list.get(i).name;
            double salary=list.get(i).salary;
            System.out.println(id + " " + name+" "+salary);
        }
    }
    Vector<Employee> sortVector(Vector<Employee> list, int n){
        Employee tem;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(list.get(j).salary<list.get(j+1).salary){
                    tem=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,tem);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit of Vector");
        int n=sc.nextInt();
        Q2 q=new Q2();
        Vector<Employee> list= q.inputVector(n);
        System.out.println("Before sorting");
        q.displayVector(list, n);
        q.sortVector(list, n);
        System.out.println("After sorting");
        q.displayVector(list, n);
    }
}
