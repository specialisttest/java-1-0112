package ru.specialist;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// ВВОД ДАННЫХ
		var sc = new Scanner(System.in);
		System.out.print("Сколько ворон на ветке: ");
		int n = sc.nextInt();
		
		// ОБРАБОТКА ДАННЫХ
		String v;
		int n2 = n % 100;
		if ( (n2 >= 11) && (n2 <= 14) )
			v = "ворон";
		else {
			v = switch ( n % 10 ) {
				case 1 		-> "ворона";
				case 2,3,4	-> "вороны";
				default 	-> "ворон"; 
			};
		}
		
		// ВЫВОД РЕЗУЛЬТАТА
		System.out.printf("На ветке %d %s\n", n, v);
		
		
		
		

	}

}
