
package examples;

import java.util.Arrays;
import java.util.Random;


public class ArrayRandMeth {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mas(9)));

       
    }
public static int[] mas(int n){
    int[] a = new int[n];
    
    Random rand = new Random(n);
        
        
    for(int i=0;i<a.length;i++){
        a[i]=rand.nextInt(n+1);
        
    }
   
        
    return a;
}    
}
