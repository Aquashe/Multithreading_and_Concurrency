public class StaticKeyword {
    public static class Emp{
        String name;
        int id ;
        int salary;
        static String ceo;
        Emp(){
            this.id = 1;
            this.salary=1000;
            this.name="not verified";
        }
        Emp(String name,int id , int salary,String ceo){
            this.id = id;
            this.salary=salary;
            this.name = name;
            Emp.ceo = ceo;

        }

        static{
            ceo = "Larry";
        }

        public void show()
        {
            System.out.println("Name : "+name+" Id : "+id+" Salary :"+salary+" CEO : "+ceo);
        }

        public  static void staticMethodExample(Emp obj){
            System.out.println("In static method");
            System.out.println("Name : "+obj.name+" Id : "+obj.id+" Salary :"+obj.salary+" CEO : "+ceo);

        }
    }

    public static void main(String[] args) {
        Emp obj = new Emp();
        Emp navin = new Emp("Navin",1,30000,"Lakshmi");
        Emp Krishna = new Emp("Krishna",2,40000,"Ramesh");

        Emp.ceo = "Thomas";

        obj.show();
        navin.show();
        Krishna.show();

        Emp.ceo = "Thomas";

        Emp.staticMethodExample(navin);

    }
}
