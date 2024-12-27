
interface Computer{
     void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Compile code run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Compile code run : Faster");
    }
}

class Devolper{
    public void devApp(Computer comp){
        comp.code();
    }
}

public class InterfaceUse {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Devolper thomas = new Devolper();
        thomas.devApp(desk);
        thomas.devApp(lap);
        
    }
}
