package arrayswork;

public class FibonachiFiltr {

    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int next = 0;

        System.out.println("*" + first);
        System.out.println("*" + second);

        for (int i = 1; i <= 23; i++) {
            next = first + second;
            if (next % 2 == 0) {

                System.out.println("**" + next);
            } else {
                System.out.println("*" + next);
            }
            first = second;
            second = next;
        }
    }

}
