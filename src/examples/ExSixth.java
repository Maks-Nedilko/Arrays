
package examples;

public class ExSixth {
    public static void main(String[] args) {
        System.out.println("Least common multiple : " + Evklid(36, 24));
    }

    public static int Evklid(int a, int b) {

        int max, min, temp;
//        max = a > b ? a : b;
//        min = a < b ? a : b;

        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if(a<b){
            min=a;
        }else{
            min=b;
        }
        
        do {
            
            temp = max - min;
            max = temp > min ? temp : min;
            min = temp < min ? temp : min;

        } while (max != min);

        return max;
    }

    
    
    
}
