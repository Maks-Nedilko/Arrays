
package doublearraywork;


public class CopyArray {
    
    static int[][] arrayCopy(int[][] orig){
        
        int[][] copy = new int [orig.length][orig.length];
        
        System.arraycopy(orig, 0, copy, 0, orig.length);
        
        return copy;
    }
    
    
     static int [] arrayCopy(int[] orig){
         
        int [] copy = new int[orig.length];
        
         System.arraycopy(orig, 0, copy, 0, orig.length);
         return copy;
    }
     public static void main(String[] args) {
        
//        int[] orig = {1,2,3,4,5};
//        int[] copy=arrayCopy(orig);
//        orig[0]=100;
//        for(int i: copy){
//            System.out.println(i);
//        }
    int [][] orig = {{4,5,6},{11,12,4},{8,8,8}};
    
    int [][] copy = arrayCopy(orig);
    
    //orig[0][0]=500;
    copy[0][0]=-70;
    
    
    for(int i=0;i<orig.length;i++){
        String s="";
        for(int j=0;j<orig[i].length;j++){
            s=s+orig[i][j] + " ";
        }
       System.out.println(s);
    }
     
     }
}
