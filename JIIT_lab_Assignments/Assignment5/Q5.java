//package JIIT_lab_Assignments.Assignment5;

class Fraction{
    Integer numerator;
    Integer denomenator;
    Fraction(Integer numerator,Integer denomenator){
        this.numerator=numerator;
        this.denomenator=denomenator;
    }
}
class Arthematic{
    Integer lcm(Integer ){

    }
    void add(Fraction f1,Fraction f2){
        Double sumReal=f1.numerator+f2.numerator;
        Double sumImg=c1.img+c2.img;
        System.out.println("Sum is: ");
        printFraction(sumReal,sumImg);
    }
    void sub(Fraction c1,Fraction c2){
        Double sumReal=c1.real-c2.real;
        Double sumImg=c1.img-c2.img;
        System.out.println("Substract is: ");
        printFraction(sumReal,sumImg);
    }
    void mul(Fraction c1,Fraction c2){
        Double sumReal=c1.real*c2.real;
        Double sumImg=c1.img*c2.img;
        System.out.println("Multiplication is: ");
        printFraction(sumReal,sumImg);
    }
    void printFraction(Double s1,Double s2){
        System.out.println(s1+"+"+s2+"i");
    }
}
public class Q5 {
    public static void main(String[] args) {
        ComplexNumber c1=new ComplexNumber(23.5, 11.7);
        ComplexNumber c2=new ComplexNumber(14.4, 42.9);
        Arthematic a1=new Arthematic();
        a1.add(c1, c2);
        a1.sub(c1, c2);
        a1.mul(c1, c2);
    }
}
