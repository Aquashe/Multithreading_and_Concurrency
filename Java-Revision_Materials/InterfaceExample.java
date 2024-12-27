interface A{

    int age =26;
    String area = "Mumbai";
public void show();
public void config();
    
}

interface X{
    public void run();
}

interface Y extends X{}

class B implements A,Y{
    public void show(){
        System.out.println("Show in B");
    }

    
    public void config() {
        
        System.out.println("Config in B");
    }

    public void run() {
        System.out.println("In run");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);
        X obj1 = new B();
        obj1.run();
    }
}
