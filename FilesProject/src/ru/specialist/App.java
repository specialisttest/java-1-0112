package ru.specialist;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class App {
	
	// ../test.txt
	public static final String FILENAME = ".."+File.separator+"test.txt";

	public static void main(String[] args) throws IOException {
		var fis = new FileInputStream(FILENAME);
		var sc = new Scanner(fis);
		
		while (sc.hasNextInt()) {
			int num = sc.nextInt();
			System.out.println(num);
		}
		
		
		sc.close();
		fis.close();

	}

}
