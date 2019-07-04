package examples;

import java.util.Arrays;
import java.util.Scanner;

public class MyExFirst {

    public static void main(String[] args) {
        
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number :");
        n = in.nextInt();
        if (n < 0) {
            throw new IllegalArgumentException("int n >0!!!");
        }
        int[] array = Fibon(n);
        System.out.println("A row of Fibonachi : " + Arrays.toString(array));
        for (int s : array) {
            System.out.println(s);
        }
        Sort(array);
        System.out.println("Reverse a row of Fibonachi : " + Arrays.toString(array));
        for (int s : array) {
            System.out.println(s);
        }

    }

    public static int[] Fibon(int n) {
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array;
    }

    public static void Sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}
