@FunctionalInterface
interface A{
    void show(int i);
}
@FunctionalInterface
interface B{
    int  add(int i,int j);
}

public class LambdaExpression {
    
    public static void main(String[] args) {
        A obj = i -> System.out.println("In show A " + i);
        obj.show(5); 

        B obj1 = (i,j)-> i+j;
        System.out.println("The sum is "+obj1.add(5, 4));;
    }
}
