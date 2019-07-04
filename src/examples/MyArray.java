package examples;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {

    public static void main(String[] args) {
        int[] array;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter long array : ");
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
        sort1(array);
        System.out.println("Sort1 array : " + Arrays.toString(array));
        sort2(array);
        System.out.println("Sort2 array : " + Arrays.toString(array));
    }

    public static void sort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sort2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
