package examples;

import java.util.Scanner;

public class ScannerLineEquation {

    public static void main(String[] args) {

        System.out.println(Equal());
    }

    public static int Equal() {
        int a, b, x;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a :");
        a = in.nextInt();
        System.out.print("Enter b :");
        b = in.nextInt();
        if (a == 0) {
            throw new IllegalArgumentException("a>0");
        } else {
            x = b / a;
            System.out.print("x = ");
        }

        return x;
    }
}
