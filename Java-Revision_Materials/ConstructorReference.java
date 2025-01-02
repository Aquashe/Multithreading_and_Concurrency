import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Students{
    String name;
    int age;
    public Students() {
    }
    public Students(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Students [name=" + name + ", age=" + age + "]";
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("navin","laxmi","Narayanan","mani");
        List<Students> students1 = names.stream()
                                        .map(name -> new Students(name))
                                        .toList();

        List<Students> students2 = names.stream()
                                        .map(Students :: new)//constructor reference
                                        .toList();        

        students1.forEach(System.out :: println);                                
        students2.forEach(System.out :: println);
    }
    
}
