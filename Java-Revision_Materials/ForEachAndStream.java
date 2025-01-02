
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ForEachAndStream {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,5,7,3,8);

        Consumer<Integer> con = n-> System.out.println(n);
        Predicate<Integer> p = n->  n%2 == 0;
        Function<Integer,Integer> fun =  n ->  n*2;

        
            
        

        nums.forEach(con);
        System.out.println("For each Example :");
        nums.forEach(n-> System.out.println(n));

        System.out.println("For Streams Example :");

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 ==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c,e)-> c+e);
        System.out.println("Stream in 3 lines :"+result);

        // U can reduce these into a single line

        //int sum = nums.stream().filter(n-> n%2==0).map(n -> n*2).reduce(0, (c,e) -> c+e);
        int sum = nums.stream().filter(p).map(fun).reduce(0, (c,e) -> c+e);

        System.out.println("The same stream in one line :"+sum);
        
    }
    
}
