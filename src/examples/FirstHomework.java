package examples;

public class FirstHomework {

    public static void main(String[] args) {
        System.out.println(str(7));
    }

    public static int sequence(int n) {
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            return -7;
        }
        return (int) (2 * sequence(n - 1) + Math.pow(-1, n) * 3 * sequence(n - 2));

    }

    public static String str(int n) {
        String line = "";
        for (int i = 1; i <= n; i++) {
            line += sequence(i) + ";";
        }
        return line;
    }

}
