import java.util.*;
class Thread1 implements Runnable{
    int nu;
    Thread1(int nu){
        this.nu=nu;
    }
    public void run(){
        System.out.println("Thread no:"+this.nu);
        Random r=new Random();
        try {
            int sleeptime=1000+r.nextInt(2000);
            Thread.sleep(sleeptime);
        } catch (Exception e) {
            System.out.println("Exeption"+e);
        }
    }

}
public class Q1 {
    public static void main(String args[]){
        Thread1 t1=new Thread1(1);
        Thread th1=new Thread(t1);
        Thread1 t2=new Thread1(2);
        Thread th2=new Thread(t2);
        Thread1 t3=new Thread1(3);
        Thread th3=new Thread(t3);
        th1.start();
        th2.start();
        th3.start();
    }
}
