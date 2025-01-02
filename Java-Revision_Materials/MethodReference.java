import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("navin","laxmi","Narayanan","mani");
        List<String> str2 = str.stream()
                                .map(String :: toUpperCase)//mention the class where it belonngs to
                                .toList();

        str2.forEach(System.out::println);
    }
    
}
