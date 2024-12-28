enum Status{
    Running, pending , failed , success;
}

enum Laptop{
    Macbook(2000),XPS,Thinkpad(4000);

    private Laptop() {
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    private Laptop(int price) {
        this.price = price;
    }

    private int price;
}

public class Enum {
    
    public static void main(String[] args) {
        Status s = Status.Running;
        switch (s) {
            case Running :
                System.out.println("It running");                
                break;
            case pending:
                System.out.println("Please wiat");
            case failed:
                System.out.println("Soory u lose");
            default:
                break;
        }



        for(Laptop lap : Laptop.values())
            System.out.println(lap +"  : "+lap.getPrice());
        
        
        

    }

}
