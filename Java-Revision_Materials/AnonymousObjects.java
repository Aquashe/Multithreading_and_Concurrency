class A{
    public A(){
        System.out.println("Object created");
    }

    void show(){
        System.out.println("Show called");
    }
}


public class AnonymousObjects {
    public static void main(String[] args) {
        new A().show();
    }
}


