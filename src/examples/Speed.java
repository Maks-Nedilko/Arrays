package examples;

import java.util.Scanner;

public class Speed {

    public static void main(String[] args) {
        float v;
        float s = 0;
        float t = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите s : ");
        if (scanner.hasNextFloat()) {
            s = scanner.nextFloat();
        }
        System.out.print("Введите t : ");
        if (scanner.hasNextFloat()) {
            t = scanner.nextFloat();
        }
        v = s / t;
        System.out.println("v = " + v);

    }
}
