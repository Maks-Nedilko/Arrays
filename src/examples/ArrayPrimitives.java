
package examples;


public class ArrayPrimitives {
    public static void main(String[] args) {
        int[] a1 ={1,2,3,4,5,6};
        int []a2;
        a2 = a1;
        for(int a:a1){
            System.out.println(a);
        }
        for(int i = 0;i<a2.length;i+=2){
            a2[i]=a2[i]+2;
        }
        for(int i= 0;i<a2.length;i++){
        System.out.println("a2[" + i +"] = " + a2[i]);
    }
    }
    
}
