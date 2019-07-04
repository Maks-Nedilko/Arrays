package examples;

import java.util.Scanner;

public class TriangleHomework {

    public static void main(String[] args) {
        Triangle();

    }

    public static void Triangle() {
        double katet1;
        double katet2;
        double gipoten;
        double s;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter katet1 = ");
        katet1 = in.nextDouble();
        System.out.print("Enter katet2 = ");
        katet2 = in.nextDouble();
        if (katet1 <= 0 || katet2 <= 0) {
            throw new IllegalArgumentException();
        } else {
            gipoten = Math.sqrt((Math.pow(katet1, 2)) + (Math.pow(katet2, 2)));
            System.out.println("Gipoten = " + gipoten + " sm");

            s = (katet1 * katet2) / 2;
            System.out.println("Triangle area = " + s + " sm^2");
        }
    }
}
