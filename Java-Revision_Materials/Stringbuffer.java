public class Stringbuffer {

        public static void main(String[] args) {

            //String Buffer is Thread safe 
            //String Builede is not 
            
            StringBuffer sb = new StringBuffer("reddy");
            sb.append(" navin");
            System.out.println(sb);
            sb.insert(6,"java");
            System.out.println(sb);
    }
}
