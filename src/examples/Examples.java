
package examples;

public class Examples {
    public static String Eq(String a,String b){
        System.out.println( a==b);
        System.out.println( a!=b);
        System.out.println( a.equals(b));
        return "";
    }

    public static void main(String[] args) {
       String a = "ss";
       String b = "ss"+" ";
        System.out.println(Eq(a,b));
        String c = "sss";
        System.out.println(Eq(a,c));
    }
    
}
