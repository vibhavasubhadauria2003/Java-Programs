// Question 3
// Write a Java program that manages a student record system using the legacy class
// Hashtable. Each student has a unique ID, name, and GPA. Implement the Comparable
// interface in the Student class to sort students by GPA in ascending order when retrieved.

// Requirements:

// Store the students in a Hashtable where the key is the student ID, and the value
// is the Student object.
// Implement the Comparable interface in the Student class to allow sorting by
// GPA.
// Retrieve and sort the student records by GPA and display the sorted list.
import java.util.*;
class Student{
    int id;
    String name;
    double gpa;
    Student(int id,String name,double gpa){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
    }
}
public class Q3 {
    Student inputStudent(int i){
        System.out.println("Enter the Student Details of"+(i+1));
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id: ");
        int id=sc.nextInt();
        System.out.println("Enter name: ");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Enter GPA: ");
        double gpa=sc.nextDouble();

        Student s=new Student(id,name,gpa);
        return s;
    }
    Hashtable<Integer,Student> inputHashTable(int n){
        Hashtable<Integer,Student> hash=new Hashtable<>();
        for(int i=0;i<n;i++){
            Student s=inputStudent(i);
            hash.put(i,s);
        }
        return hash;
    }
    public static void main(String args[]){
        Hashtable<>
    }
}
