/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayswork;

import java.util.Arrays;

/**
 *
 * @author makst
 */
public class SimpleDeleteFirstLineColumn {
    
  
    public static int[][] Mat(int[][] array,int a){
        a--;
        int[][] mat = new int[array.length-1][array[0].length-1];
        for(int i =0,i1=0;i<array.length;i++){
            if(i==a){
                continue;
            }
            mat[i1] = new int[array[i].length-1];
                for(int j =0,j1=0;j<array[i].length;j++){
                    if(j==a){
                        continue;
                    }
                    mat[i1][j1]=array[i][j];
                    j1++;
                    
            }
                i1++;
        }
        
        return mat;
    }
    
    public static void main(String[] args) {
        
        int[][] mat = new int[][]{
            {1,2,3,4},
            {0,0,0,0},
            {1,2,3,4},
            {1,2,3,4}
        };
        System.out.println(Arrays.deepToString(Mat(mat,1)));
        
        
    }
}
