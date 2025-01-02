
class Counter{
    public  int count=0;
    public synchronized  void  increment(){
        this.count++;
    }
}
public class ThreadRaceCondition {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable obj1 = ()->{
            for(int i=0;i<1000;i++)
            {
                c.increment();
                
            }
        };

        Runnable obj2 = ()->{
            for(int i=0;i<1000;i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(c.count);


        
        
    }
}
