package ru.specialist;

import java.time.LocalDate;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.io.IOException;
import java.util.Scanner;


public class App {

	public static void main(String[] args) //throws IOException 
	{
		
//		BufferedReader reader = 
//			new BufferedReader( new InputStreamReader(System.in, ) );
//		
//		System.out.print("Введите ваше имя: ");
//		String name = reader.readLine();
//		System.out.print("Введите ваш возраст: ");
//		int age = Integer.parseInt( reader.readLine() );
		// Double.parseDouble()

		Scanner sc = new Scanner( System.in );
		System.out.print("Введите ваше имя: ");
		String name = sc.nextLine();
		System.out.print("Введите ваш возраст: ");
		int age = sc.nextInt();
		
		// double x = sc.nextDouble();
		
		
		
		// Привет, Сергей - 47!
//		System.out.print("Привет, ");
//		System.out.print(name);
//		System.out.println("!");
		
		String result = String.format("Привет, %2$s - %1$d!\n", age, name);
		System.out.print(result);
		
		
		System.out.printf("Привет, %-20s - 0x%x!\n", name, age);
		
		
		System.out.printf("pi = %10.3f\n", Math.PI);
		
		LocalDate today = LocalDate.now();
		
		// 19.01.2025
		System.out.printf("Today: %td.%<tm.%<tY\n", today);
		

	}

}
