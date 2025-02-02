package ru.specialist;

public class App {

	public static void main(String[] args) {
		final int originalK1 = 462;
		final int originalK2 = 1071;
		
		//int k1 = (originalK1 > originalK2) ? originalK1 : originalK2;
		//int k2 = (originalK1 > originalK2) ? originalK2 : originalK1;
		
		int k1 = originalK1;
		int k2 = originalK2;
		
		int k3;
		
		while ( (k3 = k1 % k2) != 0 ) {
			k1 = k2;
			k2 = k3;
		}
		
		int gcd = k2;
		
		System.out.printf("GCD(%d, %d) = %d\n", originalK1, originalK2, gcd);
		
		

	}

}
