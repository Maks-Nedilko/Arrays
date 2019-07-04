
package examples;

import java.util.Random;

public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i,j,k;
        j = rand.nextInt(2) + 1;
        System.out.println("j : " +j);
        k = rand.nextInt(5) + 1;
        System.out.println("k : " + k);
        i = j + k;
        System.out.println("j + k : " + i);
        i = j - k;
        System.out.println("j - k : " + i);
        i = j * k;
        System.out.println("j * k : " + i);
        i = j / k;
        System.out.println("j / k : " + i);
        i = j % k;
        System.out.println("j % k : " + i);
        i = k % j;
        System.out.println("k % j : " + i);
        
        double u,v,w;
        v = rand.nextFloat();
        System.out.println("v : " + v);
        w = rand.nextDouble();
        System.out.println("w : " + w);
        u = v + w;
        System.out.println("v + w " + u);
        u = v - w;
        System.out.println("v - w " + u);
        u = v * w;
        System.out.println("v * w " + u);
        u = v / w;
        System.out.println("v / w " + u);
        
    }
    
}
