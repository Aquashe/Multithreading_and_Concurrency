
class A{
    void show1(){
        System.out.println("In show A");
    }
}
class B extends A{
    void show2(){
        System.out.println("In show B");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        A obj = new B(); //Upcasting  A obj = (A)new B();
        obj.show1();

        B obj1 = (B)obj;//downcasting
        obj1.show2();
        ((B)obj).show2();
    }
}
