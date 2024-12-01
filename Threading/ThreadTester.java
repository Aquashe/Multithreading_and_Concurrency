import Multithreading.*;
public class ThreadTester {

    public static void main(String[] args) {
        System.out.println("Main is starting");
        Thread thread1 = new Thread1("thread1");//Here you extending your own thread class and method overiding the run()
        thread1.setDaemon(false);
        //thread1.start();

        //Thread thread2 = new Thread(new Thread2() , "thread 2");//Here you instatiating an object of Thread classs and calling the parent Thread class run().
        //thread2.start();

        Thread thread3 = new Thread(()->{
            for(int i=0;i<3;i++)
                System.out.println("The number is "+i+" the name :"+Thread.currentThread().getName());
        },"Thread 3");
        thread3.start();
        
        System.out.println("Main is executing and stopping");
    }
}