
package arrayswork;


public class FibonachiRecurcy {

    public static void main(String[] args) {
        int[] numbers = new int[25];

        numbers[0] = 1;
        numbers[1] = 1;
        System.out.println(numbers[0]);
          System.out.println(numbers[1]);

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
            System.out.println(numbers[i]);
        }

    }
}
