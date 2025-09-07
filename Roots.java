import java.util.*;

class Roots {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a,b,c");
        int a=s1.nextInt();
        int b=s1.nextInt();
        int c=s1.nextInt();
        int D=(b*b)-4*a*c;
        if(D<0){
            System.out.println("NO real roots");
        }
        else{
            
            System.out.println("Yes it have real roots");
            double positiveRoots=(-b+Math.sqrt(D))/(2*a);
            double negativeRoots=(-b-Math.sqrt(D))/(2*a);
            System.out.println("First "+positiveRoots);
            System.out.println("Second "+negativeRoots);
        }
    }
}


