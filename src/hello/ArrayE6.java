
package hello;

import java.util.Scanner;


public class ArrayE6 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        System.out.println(a);
        System.out.println(b);
        
        gcd (a, b);
    }
    public static void gcd(int a, int b) {
        System.out.print("Type in two numbers and I will print outs its Greatest Common Divisor: ");
        int gcdNum1 = a;
        int gcdNum2 = b;
        while (gcdNum1 == 0) {
            gcdNum1 = 0;
        }
        while (gcdNum2 > gcdNum1) {
            int gcd = gcdNum1 % gcdNum2;
        }
        System.out.print(gcdNum1 + gcdNum2);
    }
    
}
