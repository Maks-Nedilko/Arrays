
package examples;

import java.util.Arrays;
import java.util.Random;


public class ArrayRandom {

    public static void main(String[] args) {
        int[] a;
        Random rand = new Random();
        a = new int[rand.nextInt(20)];
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));

        Integer[] a1 = new Integer[rand.nextInt(20)];
        System.out.println(a1.length);
        for (int i = 0; i < a1.length; i++) {
            a1[i] = rand.nextInt(500);
        }
        System.out.println(Arrays.toString(a1));
    }

}
