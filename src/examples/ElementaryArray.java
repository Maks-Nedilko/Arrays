
package examples;

import java.util.Arrays;
import java.util.Scanner;


public class ElementaryArray {
    public static void main(String[] args) {
        int [] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter arrays number :");
        n=in.nextInt();
        a= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a [" + i + "] = ");
            a[i]=in.nextInt();
            
        }
        System.out.println(Arrays.toString(a));
        
        for(int s : a){
            System.out.println(s);
        }
    }
    
}
