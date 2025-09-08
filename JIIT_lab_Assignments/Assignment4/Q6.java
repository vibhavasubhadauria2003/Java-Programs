// 6 Create an abstract class BankAccount with methods deposit(), withdraw(), and
// getBalance(). Implement subclasses SavingsAccount, CheckingAccount, and
// BusinessAccount that provide specific implementations for these methods. Write a
// program to manage different types of bank accounts.

abstract class BankAccount{
    abstract void deposit(int amount);
    abstract void withdraw(int amount);
    abstract void getBalance();
}
class SavingsAccount extends BankAccount{
    int balance;
    SavingsAccount(int balance){
        this.balance=balance;
    }
    void deposit(int amount){
        if(amount<=50000){
            balance=balance+amount;
            System.out.println("Deposited Sucesfully");
        }
        else{
            System.out.println("Limit exeded");
        }
    }
    void withdraw(int amount){
        if(amount<=40000){
            balance=balance-amount;
            System.out.println("Withrawel Sucesfully");
        }
        else{
            System.out.println("Limit exeded");
        }
    }
    void getBalance(){
        System.out.println("Your balance: "+balance);
    }
    
}
class CheckingAccount extends BankAccount{
    int balance;
    CheckingAccount(int balance){
        this.balance=balance;
    }
    void deposit(int amount){
        if(amount<=80000){
            balance=balance+amount;
            System.out.println("Deposited Sucesfully");
        }
        else{
            System.out.println("Limit exeded");
        }
    }
    void withdraw(int amount){
        if(amount<=60000){
            balance=balance-amount;
            System.out.println("Withrawel Sucesfully");
        }
        else{
            System.out.println("Limit exeded");
        }
    }
    void getBalance(){
        System.out.println("Your balance: "+balance);
    }
}
class BusinessAccount extends BankAccount{
    int balance;
    BusinessAccount(int balance){
        this.balance=balance;
    }
   void deposit(int amount){
        balance=balance+amount;
        System.out.println("Deposited Sucesfully");
    }
    void withdraw(int amount){
        balance=balance-amount;
        System.out.println("Withrawel Sucesfully");
    }
    void getBalance(){
        System.out.println("Your balance: "+balance);
    }
}
public class Q6 { 
    public static void main(String args[]){
        SavingsAccount s1=new SavingsAccount(300000);
        s1.deposit(45000);
        s1.withdraw(30000);
        s1.getBalance();
    }
}
