package doublearraywork;

import java.util.Random;

public class CopyRandomArray {

    static int[] ran(int n, int p) {
        Random random = new Random();

        int[] array = new int[n];
        int[] copy = new int[n];

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(p + 1);
        }

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        return copy;

    }

    public static void main(String[] args) {
        int[] array = ran(5, 11);

        String s = "";
        for (int i = 0; i < array.length; i++) {
            s = s + array[i] + " ";

        }
        System.out.println(s);

    }

}
