// 2 Create an interface PaymentStrategy with a method pay(). Implement different
// payment strategies like CreditCardPayment, PaypalPayment, and BitcoinPayment.
// Write a program to simulate a payment process using different strategies.


import java.util.*;
interface PaymentStrategy{
    void pay(int amount);
}
class CreditCardPayment implements PaymentStrategy{
    int ccWallet;
    CreditCardPayment(int ccWallet){
        this.ccWallet=ccWallet;
    }
    public void pay(int amount){
        ccWallet=ccWallet-amount;
    }
}
class PaypalPayment implements PaymentStrategy{
    int ppWallet;
    PaypalPayment(int ppWallet){
        this.ppWallet=ppWallet;
    }
    public void pay(int amount){
        ppWallet=ppWallet-amount;
    }
}
class BitcoinPayment implements PaymentStrategy{
    int bcWallet;
    BitcoinPayment(int bcWallet){
        this.bcWallet=bcWallet;
    }
    public void pay(int amount){
        bcWallet=bcWallet-amount;
    }
}
public class Q2 {
    public static void main(String args[]){
         System.out.println("Enter 1 to pay from Credit Card");
         System.out.println("Enter 2 to pay from Pay Pal");
         System.out.println("Enter 3 to pay from Bitcoin");
         Scanner sc=new Scanner(System.in);
         CreditCardPayment cc1=new CreditCardPayment(3000);
         PaypalPayment pp1=new PaypalPayment(1200);
         BitcoinPayment bc1=new BitcoinPayment(34000);
         int n=sc.nextInt();
         if(n==1){
            System.out.println("Credit Card Wallet amount: "+cc1.ccWallet);
            System.out.println("Enter the Amount ");
            int amount=sc.nextInt();
            cc1.pay(amount);
            System.out.println("Done,  Amount left: "+cc1.ccWallet);
         }
         else if(n==2){
            System.out.println("Pay Pal Wallet amount: "+pp1.ppWallet);
            System.out.println("Enter the Amount ");
            int amount=sc.nextInt();
            pp1.pay(amount);
            System.out.println("Done,  Amount left: "+pp1.ppWallet);
         }
         else if(n==3){
            System.out.println("Bitcoin Wallet amount: "+bc1.bcWallet);
            System.out.println("Enter the Amount ");
            int amount=sc.nextInt();
            bc1.pay(amount);
            System.out.println("Done,  Amount left: "+bc1.bcWallet);
         }
    }
}
