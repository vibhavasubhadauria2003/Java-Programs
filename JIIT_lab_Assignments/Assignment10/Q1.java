// Write a Java program to manage a list of students. The program should allow adding,
// removing, and displaying students. Each student has a name and an ID. Use an
// ArrayList to store the students.

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Q1 {
    static void displayArraylist(ArrayList<Student> list, int n) {
        for (int i = 0; i < n; i++) {
            int id = list.get(i).id;
            String name = list.get(i).name;
            System.out.println(id + " " + name);
        }
    }

    public static void main(String args[]) {
        int removeCount=0;
        ArrayList<Student> list = new ArrayList<Student>();
        System.out.println("Enter the limit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("For Student " + (i + 1));
            System.out.print("Enter id :");
            int id = sc.nextInt();
            System.out.print("Enter name :");
            sc.nextLine();
            String name = sc.nextLine();
            Student s = new Student(id, name);
            list.add(s);
        }
        System.out.println("Displaying list");
        displayArraylist(list, n);
        System.out.println("Enter the index to remove");
        int x = sc.nextInt();
        list.remove(x);
        removeCount++;
        System.out.println("List after removal");
        displayArraylist(list, n-removeCount);
    }
}
