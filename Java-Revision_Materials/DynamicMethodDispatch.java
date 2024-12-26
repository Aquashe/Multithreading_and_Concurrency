class A{
    public void show(){
        System.out.println("In show A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In show B");
    }
}

class C extends A{
    public void show(){
        System.out.println("In show C");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
     //Refrence of a super class and Object of a sub class
     //It only works for inheritance
     //Example of run time Polymorphism
     //Whatever the type is the object is imp.
        A obj = new B();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
