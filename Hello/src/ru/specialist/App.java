package ru.specialist;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// ВВОД ДАННЫХ
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите ваше имя: ");
		String userName = null;
		userName = sc.nextLine();
		
		// ОБРАБОТКА ДАННЫХ
		if (userName.isBlank())
			userName = "Незнакомец";
		
		//  ВЫВОД РЕЗУЛЬТАТА
		System.out.printf("Привет, %s!\n", userName);
		
		
		/*
		// ОБРАБОТКА ДАННЫХ
		String hello;
		if (userName.isBlank())
			hello = "Привет, Незнакомец!";
		else
			hello = String.format("Привет, %s!", userName);
		
		//  ВЫВОД РЕЗУЛЬТАТА
		System.out.println(hello);*/
		

	}

}
