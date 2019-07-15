package doublearraywork;

import java.util.Arrays;

public class SumArrayRandom {

    public static void main(String[] args) {

        int[][] array = new int[10][10];
        int sum;
        sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = (int) (Math.random() * 8);

                sum = sum + array[i][j];
            }
        }
        for (int[] s : array) {
            System.out.println(Arrays.toString(s));
        }
        //System.out.println(Arrays.toString(array));
        System.out.println(sum);

    }

}
