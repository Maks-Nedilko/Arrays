
package doublearraywork;

import java.util.Arrays;


public class SortArray {
    
    public static void main(String[] args) {
        int [] ar={0,5,8,-10,1,7,22,15};
        System.out.println("Array : " + Arrays.toString(ar));
        sort(ar);
        System.out.println("Sort array : " + Arrays.toString(sort(ar)));
        for(int a: ar){
            System.out.println(a);
        }
    }
    
    
    public static int[] sort(int[] array){
        for(int i =0; i<array.length;i++){
            for(int j = 0;j<array.length-1;j++){
                if (array[j]>array[j + 1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
        return array;
    }
    
}
