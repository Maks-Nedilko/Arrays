package examples;

import java.util.Scanner;

public class Total {

    public static void main(String[] args) {
        
        double c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a : ");
        double a = scanner.nextDouble(); 
        System.out.print("enter b : ");
        double b = scanner.nextDouble();
        c = a * b;
        System.out.println("total : " + c);

    }
}
