class A{
public A(){
    System.out.println("In A default");
}
public A(int n){
    System.out.println("In A params");
}
}

 class B extends A{
public B(){
System.out.println("In B default");
}

public  B(int n){
    super();
    System.out.println("In B Params");
}
    
}


public class ThisAndSuper {
    public static void main(String[] args) {
        new B(5);
    }
}
