

class B implements Runnable{
    public void run(){
        try {
            for(int i=0;i<5;i++)
        {
            System.out.println("hello "+i);
            Thread.sleep(10);
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadRunnable {
    public static void main(String[] args) {
        Runnable obj1 = ()-> {
                try {
                    for(int i=0;i<3;i++)
                {
                    System.out.println("hi "+i);
                    Thread.sleep(10);
                }
                } catch (Exception e) {
                    System.out.print(e.getMessage());
                }
            };
        
        Runnable obj2 = new B(){
            public void run(){
                try {
                    for(int i=0;i<3;i++)
                {
                    System.out.println("hello "+i);
                    Thread.sleep(10);
                }
                } catch (Exception e) {
                    System.out.print(e.getMessage());
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);//Thread class accepts Runnable objects

        t1.start();
        t2.start();
    }
}
