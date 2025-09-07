
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
}
public class Student extends Person {
	String studentId;
	Student(String name,int age,String studentId){
		super(name,age);
		this.studentId=studentId;
	}
	public static void main(String args[]) {
		Student s1=new Student("Amit",22,"mcg2200456");
		System.out.println("Name of student "+s1.name);
        System.out.println("Age of student "+s1.age);
        System.out.println("Student ID is "+s1.studentId);
	}
}