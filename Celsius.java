import java.util.*;
class BMI
{
    public static void main(String args[])
    {
        System.out.println("Enter weight and hight of person");
        Scanner sc=new Scanner(System.in);
        float w=sc.nextFloat();
        float h=sc.nextFloat();
        float bmi=w/(h*h);
        System.out.println("BMI of that person is "+bmi);
    }
}