package com.ahsanbagwan.clrs;

public class Factorial {

	public static void main(String[] args){
		System.out.println("factorial " + factorial(5));
	}
	
	public static int factorial(int n){
		int result = 1;
		if (n == 1){
			return 1;
		}
		else if (n > 1){
			while(n > 1){
				result *= n;
				n = n-1;
			}
		}
		return result;
	}
}
