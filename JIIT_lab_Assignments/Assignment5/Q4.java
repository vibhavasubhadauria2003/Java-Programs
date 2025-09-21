//package JIIT_lab_Assignments.Assignment5;
class ComplexNumber{
    Double real;
    Double img;
    ComplexNumber(Double real,Double img){
        this.real=real;
        this.img=img;
    }
}
class Arthematic{
    void add(ComplexNumber c1,ComplexNumber c2){
        Double sumReal=c1.real+c2.real;
        Double sumImg=c1.img+c2.img;
        System.out.println("Sum is: ");
        printComplex(sumReal,sumImg);
    }
    void sub(ComplexNumber c1,ComplexNumber c2){
        Double sumReal=c1.real-c2.real;
        Double sumImg=c1.img-c2.img;
        System.out.println("Substract is: ");
        printComplex(sumReal,sumImg);
    }
    void mul(ComplexNumber c1,ComplexNumber c2){
        Double sumReal=c1.real*c2.real;
        Double sumImg=c1.img*c2.img;
        System.out.println("Multiplication is: ");
        printComplex(sumReal,sumImg);
    }
    void printComplex(Double s1,Double s2){
        System.out.println(s1+"+"+s2+"i");
    }
}
public class Q4 {
    public static void main(String[] args) {
        ComplexNumber c1=new ComplexNumber(23.5, 11.7);
        ComplexNumber c2=new ComplexNumber(14.4, 42.9);
        Arthematic a1=new Arthematic();
        a1.add(c1, c2);
        a1.sub(c1, c2);
        a1.mul(c1, c2);
    }
}
