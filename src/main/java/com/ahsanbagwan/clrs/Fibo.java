package com.ahsanbagwan.clrs;

public class Fibo {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Fibo " + fibo(6));
		System.out.println("Recursive Fibo " + fiboRecursive(5));
	}

	static int fibo(int n) {
		if (n < 0)
			return -1; 
		if (n == 0)
			return 0;
		int a = 1, b = 1;
		for (int i = 3; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
	static int fiboRecursive(int n) {
		if (n == 0){
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		else if (n > 1){
			return fibo(n-1) + fibo(n-2);
		}
		return -1;
	}
}
