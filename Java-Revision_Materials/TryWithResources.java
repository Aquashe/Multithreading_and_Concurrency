import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        int i=6,j=0;
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the number : ");
            int num = Integer.parseInt(br.readLine());
            j = i/num;
        }
        finally{
            System.out.println(j);

            //br.close();
        }
        
    }
}
