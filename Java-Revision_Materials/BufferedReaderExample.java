import java.io.InputStreamReader;
import java .io.*;
import java.io.IOException;
public class BufferedReaderExample {
    
        public static void main(String[] args) throws IOException {
            System.out.println("Enter the number");
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(in);
            bf.readLine();
            System.out.println(bf.toString());

            bf.close();


        

    }
}
