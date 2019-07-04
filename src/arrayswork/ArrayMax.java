/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayswork;

/**
 *
 * @author makst
 */
public class ArrayMax {
    



    
    public static void main(String[] args) {
        
        int [] myArray = {4, 5, 8, 2, 9, 55 ,3};
        int max = Integer.MIN_VALUE;
                
        for (int i = 0; i < myArray.length; i++){
           max = Math.max(max, myArray[i]);
        }
//int result = myArray[0];
//for(int i = 1 ;i < myArray.length;i++){
//    if(result<myArray[i]){
//        result=myArray[i];
//    }
//}
//        System.out.println("Max value : " + result);
    
        System.out.println("Max value : " + max);
    }
    
    
    
    
}
    

