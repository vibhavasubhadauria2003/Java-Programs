
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

class Producer extends Thread
{
    BlockingQueue<Integer> queue;
    Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                System.out.println("Adding : "+i);
                queue.add(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
    }
}


class Consumer extends Thread
{
    BlockingQueue<Integer> queue;
    Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    public void run(){
        while(true){

            try {
                int item=queue.take();
                System.out.println("Removed : "+item);
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue=new LinkedBlockingQueue<>();
        Producer producer=new Producer(queue);
        Consumer consumer=new Consumer(queue);
        producer.start();
        consumer.start();
    }
}
