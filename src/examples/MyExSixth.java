package examples;

public class MyExSixth {

    public static void main(String[] args) {
        System.out.println(Evklid(36, 24));

    }

    public static int Evklid(int a, int b) {
        int max, min, temp;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        do {
            temp = max - min;
            max = temp > min ? temp : min;
            min = temp < min ? temp : min;
        } while (max != min);

        return max;
    }
}
