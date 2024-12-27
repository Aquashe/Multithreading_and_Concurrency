class A{
    public void show(){
        System.out.println("In A Show");
    }

    public void fly(){
        System.out.println("In fly");
    }
}

abstract class B{
    abstract public void show(); 

    abstract public void fly();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        //If you want to updated a method of a class you can use Anonymous inner class
        A obj = new A(){
            public void show(){
                System.out.println("New Show");
            }
        };
        obj.show();
        obj.fly();



        //If you want to implement inteface or abstract class once you can use Anonymous inner class
        B obj2 = new B() {
            public void show(){
                System.out.println("In B show");
            }

            public void fly(){
                System.out.println("In B fly");
            }
        };

        obj2.show();
        obj2.fly();
    }
}
