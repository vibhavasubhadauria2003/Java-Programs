
import java.util.*;

class MyExeption extends Exception {
    public MyExeption(String s) {
        super(s);
    }
}

class User {
    String accNo;
    double balance;
    String password;

    User(String accNo, double balance, String password) {
        this.accNo = accNo;
        this.balance = balance;
        this.password = password;
    }
}

public class Q6 {
    static int serchUser(User u[], String accNo) {
        int index = -1;
        for (int i = 0; i < 5; i++) {
            String tem = u[i].accNo;
            if (tem.equals(accNo) == true) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String args[]) {
        System.out.println("Please enter account number");
        Scanner sc = new Scanner(System.in);
        User u[] = new User[5];
        u[0] = new User("1001", 8566.0, "password1");
        u[1] = new User("1002", 326523.0, "password2");
        u[2] = new User("1003", 302183.0, "password3");
        u[3] = new User("1004", 81342.0, "password4");
        u[4] = new User("1005", 2000.0, "password5");
        String inputAccNo = sc.nextLine();
        try {
            int index = serchUser(u, inputAccNo);
            if (index == -1) {
                throw new MyExeption("Bank Account not Fount");
            }
            System.out.println("Enter 1 to Depodit");
            System.out.println("Enter 2 to Withdraw");
            System.out.println("Enter 3 to Check Blance");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    double depositMoney = sc.nextDouble();
                    if (depositMoney < 0) {
                        throw new MyExeption("Deposit Amount can't be zero");
                    }
                    u[index].balance = u[index].balance + depositMoney;
                    System.out.println("New Balance: " + u[index].balance);

                    break;
                case 2:
                    System.out.println("Enter the amount to Withdraw and password");
                    double withdrawMoney = sc.nextDouble();
                    sc.nextLine();//to consume extra \n in buffer memory
                    String password = sc.nextLine();
                    if (password.equals(u[index].password) == false) {
                        throw new MyExeption("Incorrect Password");
                    }
                    if (withdrawMoney < 0) {
                        throw new MyExeption("Withraw Amount can't be zero");
                    }
                    if (withdrawMoney > u[index].balance) {
                        throw new MyExeption("Not Enough Amount");
                    }
                    u[index].balance = u[index].balance - withdrawMoney;
                    System.out.println("New Balance: " + u[index].balance);
                    break;
                case 3:
                    System.out.println("Enter the password");
                    sc.nextLine();//to consume extra \n in buffer memory
                    String password2 = sc.nextLine();
                    if (password2.equals(u[index].password) == false) {
                        throw new MyExeption("Incorrect Password");
                        
                    }
                    System.out.println("Your Balance: " + u[index].balance);
                    break;

                default:
                    System.out.println("Wrong option choosen");
                    break;
            }
        } catch (MyExeption e) {
            System.out.println(e.getMessage());
        }

    }
}
