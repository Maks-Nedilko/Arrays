
package examples;


public class ExSeventh {

    public static void main(String[] args) {

        
        System.out.println("5!! = " + Fac(5));
    }

    public static int Fac(int n) {
        int res = 1;
        for (int i = 1; i <= n; i += 2) {
            res *= i;
            
        }
        return res;
    }
}
