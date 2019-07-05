package doublearraywork;

import java.util.Arrays;

public class MatrixTransport {

    public static double[][] tran(double[][] array) {

        double[][] result = new double[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = array[j][i];

            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] array = tran(matrix);

        for (int i = 0; i < array.length; i++) {
            String s = "";
            for (int j = 0; j < array.length; j++) {
                s = s + array[i][j] + " ";
            }
            System.out.println(s);
        }

    }

}
