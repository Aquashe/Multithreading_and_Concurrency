

abstract class Car{
    abstract public void drive();

    abstract public void fly();

    public void music(){
        System.out.println("Music in");
    }
}

abstract class Wagnor extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}

class UpdatedWaganor extends Wagnor{//concrete class
    public void fly(){
        System.out.println("Flying");
    }

    public void music(){
        System.out.println("Music in Updated Waganor");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Car obj = new Car();   Creating an object of abstarct class is not possible
        //What ever method abstarcted it shoud defined in its subclass or make it abstract also
        Car obj2 = new UpdatedWaganor();
        obj2.music();
    }
}
