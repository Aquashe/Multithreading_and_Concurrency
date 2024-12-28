class Myexception extends Exception{
    public Myexception(String s)
    {
        super(s);
    }
}

public class TryCatch {
    public static void main(String[] args) {
        int i=22 ;
        int j= 0;
        int a [] = new int[2];
        try{

            if(i>20)
                throw new Myexception("My own exception");
            j= 18/i;
            if(j==0)
                throw new ArithmeticException("Please enter not again zero");
            System.out.println(a[3]);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("j : "+j);
        System.out.println("Bye");

    }
}
