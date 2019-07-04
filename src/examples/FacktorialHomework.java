
package examples;

import java.util.Scanner;

public class FacktorialHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number Factorial : ");
        int n = in.nextInt();
        System.out.println("n!(i++) : " + Fac(n));
        System.out.println("n!(i--) : " + Fack(n));
        
    }
    
    public static int Fac(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        
        return res;
    }
    
    public static int Fack(int n){
        int res=1;
        for(int i=n;i>0;i--){
            res*=i;
        }
        return res;
    }
    
}
