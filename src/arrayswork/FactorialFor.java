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
public class FactorialFor {
    static int calculateFactorial(int n){
		int result = 1;
		for (int i = 1; i <=n; i ++){
			result = result*i;
		}
		return result;
	}	
 
	public static void main(String[] args){
		System.out.println(calculateFactorial(5)); 
	}
    
}
