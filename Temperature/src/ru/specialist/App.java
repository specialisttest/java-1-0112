package ru.specialist;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// ВВОД ДАННЫХ
		Scanner sc = new Scanner( System.in );
		System.out.print("T (C): ");
		double tc = sc.nextDouble();
		
		// ОБРАБОТКА ДАННЫХ
		double tf = tc * 9 / 5 + 32;
		
		// ВЫВОД ДАННЫХ 
		System.out.printf("T (F): %.2f\n", tf);
	}

}
