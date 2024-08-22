import java.util.*;
class Loan
{
   public static void main(String args[])
   {
      System.out.println("Enter your Creadit Score");
      Scanner sc=new Scanner(System.in);
      int creditScore=sc.nextInt();
      System.out.println("Enter your Anual income");
      int anualIncome=sc.nextInt();
      
      if(creditScore>=650&&anualIncome>=30000)
         System.out.println("Your loan request has been apporved");
      else
         System.out.println("Your loan request has been rejected");
    }
}