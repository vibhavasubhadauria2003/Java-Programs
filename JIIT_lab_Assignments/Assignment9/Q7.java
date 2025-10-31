import java.util.*;

class MyExeption extends Exception {
    public MyExeption(String s) {
        super(s);
    }
}

class Product {
    String name;
    int quant;
    double price;

    Product(String name, int quant, double price) {
        this.name = name;
        this.quant = quant;
        this.price = price;
    }
}

public class Q7 {
    static int serchPro(Product p[], String name1) {
        int index = -1;
        for (int i = 0; i < 5; i++) {
            String tem = p[i].name;
            if (tem.equals(name1) == true) {
                index = i;
            }
        }
        return index;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Product p[]=new Product[7];
        int i=0;
        p[i++]=new Product("Mouse", 28, 500);
        p[i++]=new Product("Keyboard", 20, 700);
        p[i++]=new Product("Monitor", 7, 10000);
        p[i++]=new Product("Speaker", 18, 2000);
        p[i++]=new Product("Headphone", 30, 1500);
        p[i++]=new Product("Pendrive", 50, 1000);
        System.out.println("Enter 1 to add Item");
        System.out.println("Enter 2 to Update quantities");
        System.out.println("Enter 3 to calculate total");
        int n=sc.nextInt();
        try {
            switch (n) {
            case 1:
                System.out.println("Enter name of product");
                sc.nextLine();
                String name1=sc.nextLine();
                System.out.println("Enter quantity of productl");
                int quant1=sc.nextInt();
                System.out.println("Enter price of productl");
                double price1=sc.nextDouble();
                if(quant1<0){
                    throw new MyExeption("Quantity can't be negative");
                    }
                if(price1<=0.0){
                    throw new MyExeption("Quantity can't be zero or negative");
                }
                p[i++]=new Product(name1,quant1,price1);
                break;
            case 2:
                System.out.println("Enter name of product");
                sc.nextLine();
                name1=sc.nextLine();
                int index=serchPro(p, name1);
                if(index==-1){
                    throw new MyExeption("Product not found");
                }
                System.out.println("Enter quantity to update positive to increase negative to decrease");
                quant1=sc.nextInt();
                p[index].quant=p[index].quant+quant1;
                break;
            case 3:
                double total=0.0;
                for(int j=0;j<p.length;j++){
                    total=total+p[j].price;
                }
                System.out.println("Total: "+total);
                break;
        
            default:
                System.out.println("Invalid Input");
                break;
         }
        }catch(MyExeption e)
    {
        System.out.println(e.getMessage());
    }
}

}
