
package examples;

import java.util.Arrays;


public class ExThird {

    public static void main(String[] args) {

        int[] array = Array();
        System.out.println("Random array : " + Arrays.toString(array));
        Sort1(array);
        System.out.println("Sort1 random array :" + Arrays.toString(array));
        Sort2(array);
        System.out.println("Sort2 random array : " + Arrays.toString(array));

    }

    public static int[] Array() {

        int n = (int) (Math.random() * 11);

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        return array;
    }

    public static void Sort1(int[] array) {
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

    public static void Sort2(int[] array) {
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
