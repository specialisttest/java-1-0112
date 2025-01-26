package ru.specialist;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int n = -101;
		
		if ( n > 0 ) {
			System.out.println("n больше нуля");
			System.out.println("n > 0");
		}
		else 
			if (n < -100)
				System.out.println("n < -100");
			else
				System.out.println("n <= 0");
		
		String userName = "";
		
		//userName.isEmpty()
		//userName.isBlank()
		
		int a = 0;
		
		/*String s;
		if (a == 0)
			s = "ноль";
		else
			s = "не ноль";*/
		
		String s = (a == 0) ? "ноль" : "не ноль";
		
		System.out.println(s);
		
		String name = null;
		
		/*if ( name != null )
			System.out.println( name.toUpperCase() );
		else
			System.out.println( "<не имени>" );*/
		
		System.out.println( (name != null) ? name.toUpperCase() : "<не имени>"  );
		
		//final double v = (new Scanner(System.in)).nextDouble(); // финализированная переменная
		//System.out.println(v);
		// v = 11;
		//System.out.println(v);
		
		
		final double fraction = 0.1415;
		final double PI = 3 + fraction; // константа
		
		System.out.println( PI );
		System.out.println( 2 * PI );
		
		int m = 10;
		
		final int ONE = 3;
		
		/*switch( m ) {
			case -1: 
			case 1:
				System.out.println( "один" );
				break; // return
			case 1+ONE:
				System.out.println( "два" );
				break;
			case 3:
				System.out.println( "три" );
				break;
			default:
				System.out.println( "много" );
				//break;
		}*/
		
		/*String result;
		switch( m ) {
			case -1: 
			case 1:
			//case 1, -1: // since Java 14
				result =  "один";
				break;
			case 2:
				result = "два";
				break;
			case 3:
				result = "три";
				break;
			default:
				result = "много";
				//break;
		}*/
		
		// Switch expression (Java 14)
		String result = switch( m ) {
			case -1, 1 	-> "один";
			case 2		-> "два";
			case 3		-> "три";
			default 	-> "много";
		};
		
		
		
		System.out.println( result );
		
		
		
		
		
		

	}

}
