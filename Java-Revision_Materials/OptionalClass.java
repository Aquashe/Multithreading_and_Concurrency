import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("navin","laxmi","Narayanan","mani");
        String s = str.stream()
                      .filter(i -> i.contains("x"))
                      .findFirst()
                      .orElse("Not found");


        Optional<String> s2 =   str.stream()
                                     .filter(i -> i.contains("x"))
                                    .findFirst() ;              
                      
        System.out.println(s);
        System.out.println(s2.orElse("Not found"));
    }
    
}
