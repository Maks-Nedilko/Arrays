/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayswork;

/**
 *
 * @author makst
 */
public class ModDoubleFactorialFor {
    static int calculateFactorial(int n){
		int result = 1;
		for (int i = 2; i <=n; i = i+2){
			result = result*i;
		}
		return result;
	}	
 
	public static void main(String[] args){
		System.out.println(calculateFactorial(6)); 
	}
    
}
