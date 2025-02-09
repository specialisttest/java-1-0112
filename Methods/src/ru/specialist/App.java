package ru.specialist;

import java.math.BigDecimal;

public class App {
	
	/*
	 * n! = 1 * 2 * 3 .. (n-1) * n
	 * 0! = 1
	 * n! = (n-1)! * n
	 * 
	 */
	public static int factorialRecursive(int n) {
		if (n == 0) return 1;
		return n * factorialRecursive(n-1);
	}
	
	public static int factorialIterative(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++)
			result *= i; // Math.multiplyExact(n, result)
						 //  Math.addExact(n, result)
		return result;
	}
	
	public static int factorial(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++)
			result = Math.multiplyExact(result, i); 
						
		return result;
	}
	/*public static long factorial(long n) {
		long result = 1L;
		for(long i = 1L; i <= n; i++)
			result = Math.multiplyExact(result, i); 
						
		return result;
	}*/
	public static BigDecimal factorial(long n) {
		BigDecimal result = BigDecimal.ONE;
		for(long i = 1L; i <= n; i++)
			result = result.multiply(BigDecimal.valueOf(i));
						
		return result;
	}
	
	public static int gcd(int k1, int k2) {
		int k3;
		
		while ( (k3 = k1 % k2) != 0) {
			k1 = k2;
			k2 = k3;
		}
		
		return k2;
	}
	
	public static int gcd(int k1, int k2, int k3) {
		return gcd(gcd(k1, k2), k3);
	}
	public static int gcd(int k1, int k2, int k3, int k4) {
		return gcd(gcd(k1, k2, k3), k4);
	}
	public static int gcd(int k1, int k2, int k3, int k4, int k5) {
		return gcd(gcd(k1, k2, k3, k4), k5);
	}

	public static void sayHello() {
		sayHello("Незнакомец");
	}
	
	public static void sayHello(String name /*= "Незнакомец" C++ C#*/ ) {
		System.out.printf("Привет, %s!\n", name);
	}
	public static void sayHello(String name, int age, String city) {
		System.out.printf("Привет, %s - %d : %s!\n", name, age, city);
		//return;
	}
	
	// overloading - перегрузка
	
	public static double average(int a, int b) {
		double avg = (a + b) / 2d;
		return avg;
	}
	
	public static double average(double a, double b) {
		double avg = (a + b) / 2d;
		return avg;
	}
	
	public static void main(String[] args) {
		/*App obj = new App();
		obj.sayHello();
		obj.sayHello();*/
		App.sayHello("Сергей", 27, "Москва"); // name = "Сергей"
		sayHello("Андрей", 34, "Санкт-Петербург"); // name = "Андрей"
		sayHello("Анна");
		sayHello();
		
		double x = average(10, 11); 
		
		System.out.println( x );
		
		System.out.println( average(11, 12) );
		System.out.println( average(2.5, 3.7) );
		
		System.out.printf("6! = %d\n", factorialRecursive(6) );
		System.out.printf("6! = %d\n", factorialIterative(6) );
		System.out.printf("16! = %d\n", factorialIterative(16) ); //неверно 
		System.out.printf("17! = %d\n", factorialIterative(17) );
		
		try {
			System.out.printf("12! = %d\n", factorial(12) );
			System.out.printf("13! = %d\n", factorial(13) );
		}
		catch(ArithmeticException a) {
			System.out.println( a.getMessage() );
		}
		try {
			System.out.printf("20! = %s\n", factorial(20L) );
			System.out.printf("121! = %s\n", factorial(121L) );
		}
		catch(ArithmeticException a) {
			System.out.println( a.getMessage() );
		}
		
		
		System.out.println( gcd( 462, 1071) );
		
		System.out.println( gcd( 462, 1071, 14) );
		
		

	}

}
