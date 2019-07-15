/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
//6
/**
 *
 * @author makst
 */
public class ArrayE61 {
    public static void main(String[] args) {
        System.out.println("наибольший общий делитель  " +GCD(100, 50));
        System.out.println();
        
    }
    
    
    
    public static int GCD(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        } else if (m == 0) {
            return m;
        } else if (n == 0) {
            return n;
        } else if (n == m) {
            return m;
        } else if (m % 2 == 0 && n % 2 == 0) {
            return 2 * GCD(m / 2, n / 2);
        } else if (m % 2 == 0 && n % 2 == 1) {
            return GCD(m / 2, n);
        } else if (n % 2 == 0 && m % 2 == 1) {
            return GCD(m, n / 2);
        } else {
            if (m > n) return GCD((m-n) / 2, n);
            else return GCD((n-m) / 2, m);
       
        }
        
    
    }
}
