
package examples;

import java.util.Arrays;
import java.util.Scanner;

public class ExamplesArr {

    public static void main(String[] args) {
        int[] array;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array long : ");
        n = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter [" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        for (int s : array) {
            System.out.println(s);
        }
        System.out.println("Array : " + Arrays.toString(array));
        sort(array);
        System.out.println("Sort1 array : " + Arrays.toString(array));
        sort1(array);
        System.out.println("Sort2 array : " + Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void sort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

}
