//package JIIT_lab_Assignments.Assignment5;
enum OrderStatus{
    NEW{
        public OrderStatus nextStatus(){
            return PROCESSING;
        }
    },
    PROCESSING{
        public OrderStatus nextStatus(){
            return SHIPPED;
        }
    }, 
    SHIPPED{
        public OrderStatus nextStatus(){
            return DELIVERED;
        }
    }, 
    DELIVERED{
        public OrderStatus nextStatus(){
            return null;
        }
    };
    public abstract OrderStatus nextStatus();
}
public class Q2 {
    public static void main(String[] args) {
        OrderStatus o1= OrderStatus.NEW;
        while(o1!=null){
            System.out.println("Your Order is "+o1);
            o1=o1.nextStatus();
        }
    }
}
