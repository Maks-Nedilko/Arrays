/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayswork;

import static java.lang.System.arraycopy;
import java.util.Arrays;

/**
 *
 * @author makst
 */
public class TriangleArray {
    
    public static int[][] createArray(int[] array){
        
        int[][] result = new int[array.length][];
        
        for(int i =0;i<array.length;i++){
            result[i] = new int[array.length - i];
            System.arraycopy(array, i, result[i],0,array.length-i);
        }
        
        return result;
        
    }
    
    public static void main(String[] args) {
        
        int[][] matrix = createArray(new int[]{1,2,3,4,5,6});
        System.out.println(Arrays.deepToString(matrix));
        String s;
        for(int i =0;i<matrix.length;i++){
            s="";
            for(int j=0;j<matrix[i].length;j++){
                
                s+=matrix[i][j] + " ";
                
            }
            System.out.println(s);
            
        }
    }
}
