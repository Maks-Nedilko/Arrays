
package examples;

import java.util.Arrays;
import java.util.Scanner;


public class ExSecond {
    public static void main(String[] args) {
//        int [] array = {1,3,2,6,4,7,5};
//        System.out.println(Max(array));
        int[] array = Random();
        System.out.println("Array : "+Arrays.toString(array));
        Sort1(array);
        System.out.println("Sort first : " + Arrays.toString(array));
        Sort2(array);
        System.out.println("Sort second : " + Arrays.toString(array));
        System.out.println("Max values : " + Max(array));
        
    }
    
    public static int[] Random(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of array :");
        int n = in.nextInt();
        int [] array = new int[n];
        
        for(int i=0;i<n;i++){
            array[i] = (int) (Math.random() * 11);
        }
        return array;
    }
    
   public static int Max(int [] array){
       int max=array[0];
       for(int i=1;i<array.length;i++){
           if(max<=array[i]){
               max =array[i];
           }
           
       }
       
       return max;
       
   } 
    public static void Sort1 (int [] array){
        for(int i = 0; i<array.length;i++){
            for(int j = 0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void Sort2(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]<array[j+1]){
                int temp=array[j];
                array[j] = array[j+1];
                array[j+1]=temp;
            }
                
        }
    }
}
    
}