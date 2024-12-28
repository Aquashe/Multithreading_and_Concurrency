class A extends Thread{
    public void run(){
        try {
            for(int i=0;i<10;i++)
        {
            System.out.println("hi "+i);
            Thread.sleep(10);
        }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}

class B extends Thread{
    public void run(){
        try {
            for(int i=0;i<10;i++)
        {
            System.out.println("hello "+i);
            Thread.sleep(10);
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
