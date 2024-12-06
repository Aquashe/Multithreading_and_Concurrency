public class MethodOverriding {
    static class  cal {
        int add(int n1,int n2){
            return n1+n2;
        }
    }
    
    static class advCal extends cal{
        @Override
         int add(int n1,int n2){
            return n1+n2+1;
        }
    }

    public static void main(String[] args) {
        advCal obj = new advCal();
        int result = obj.add(3, 4);
        System.out.println(result);
    }

}
