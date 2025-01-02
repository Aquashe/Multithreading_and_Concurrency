import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>{
    String name;
    int age;
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Students [name=" + name + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Students that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class ComparatorExample {


    public static void main(String[] args) {

        Comparator c = new Comparator<Integer>() {
            public int compare(Integer i , Integer j){
                if(i%10 > j %10)
                    return 1;
                else 
                    return -1;
            }
        };

        Comparator s = new Comparator<String>() {
            public int compare(String i , String j){
                if(i.length() > j.length())
                    return 1;
                else 
                    return -1;
            }
        };
        
        Comparator<Students> st = ( o1, o2)-> o1.age > o2.age? 1:-1;
        
        List<Integer> nums = new ArrayList<>();
        nums.add(73);
        nums.add(21);
        nums.add(62);
        nums.add(54);

        List<String >numsString = new ArrayList<>();
        numsString.add("Hari");
        numsString.add("Janimao");
        numsString.add("me");
        numsString.add("she");

        // Collections.sort(nums , c);
        // for(int  n :nums)
        //     System.out.println("Integers :"+n);

        // Collections.sort(numsString , s);
        // for(String  n :numsString)
        //     System.out.println("Strings :"+n);

        List<Students> student = new ArrayList<>();
        student.add(new Students("navin", 20));
        student.add(new Students("Hari", 40));
        student.add(new Students("Chnadhu", 24));
        student.add(new Students("kuttan", 30));


        Collections.sort(student ,st );
        for(Students studs : student)
            System.out.println(studs);

        nums.forEach(n -> System.out.println(n));
        

    }
    
}
