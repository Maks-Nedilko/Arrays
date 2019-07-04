
package arrayswork;

import java.util.Arrays;

import java.util.Scanner;

public class ArraySortScan {

    public static void main(String[] args) {
        int[] Array = new int[3];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (1+(Math.random() * 100));
            System.out.println(Array[i]);
            
          
        }
    System.out.println("Enter method sort(1 or 2): ");
    Scanner sc = new Scanner(System.in);
        double  a = sc.nextDouble();
        
        if (a==1) 
        {
            for (int i=1; i < Array.length; i++) { // Sort
            for (int j=i; j > 0; j--) {
                if (Array[j] > Array[j-1]) {
                    int temp=Array[j-1];
                    Array[j-1]=Array[j];
                    Array[j]=temp;
                }
            }
    }
        System.out.println("-----------------------");
    for (int i = 0; i < Array.length; i++) {
            
            System.out.println(Array[i]);
          
        }
        }
        else if (a==2) 
        {
            for (int i=1; i < Array.length; i++) { // Sort
            for (int j=i; j > 0; j--) {
                if (Array[j] < Array[j-1]) {
                    int temp=Array[j-1];
                    Array[j-1]=Array[j];
                    Array[j]=temp;
                }
            }
            }
            System.out.println("----------------------");
            for (int i = 0; i < Array.length; i++) {
            
            System.out.println(Array[i]);
          
        }
        }
        else   
        {
            System.out.println("Eror");
        
        }
    
            
    
    
    
    
}
}
        
    
        
                
            
        
    

