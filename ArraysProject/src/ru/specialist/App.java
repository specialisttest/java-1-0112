package ru.specialist;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*int x1 = 100, x2 = 200, x3 = 300;
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);*/
		
//		int[] nums = new int[3]; // JVM заполняется 0
//		nums[0] = 100;
//		nums[1] = 200;
//		nums[2] = 300;
		
		//int[] nums = new int[] {100, 200, 300};
		//int[] nums = {100, 200, 300};
		
		int[] nums = new int[3];
		for(int i = 0; i < nums.length; i++)
			nums[i] = (i+1)*10;
		
		for(int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
		
		
		/*System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);*/
		
		String s;
		
		
		String[] courses = new String[]
				{ "Java Client-Server", "Java 1. Base", "Spring", "Java 2. OOP" };
		
		System.out.println(courses.length);
		for(int i=0; i < courses.length; i++)
			System.out.println( courses[i] );
		
//		System.out.print("Введите количество doubles: ");
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		double[] doubles = new double[size];
//		
//		for(int i = 0; i < doubles.length; i++) {
//			System.out.printf("doubles[%d]: ", i);
//			doubles[i] = sc.nextDouble();
//		}
//		
//		for(int i = 0; i < doubles.length; i++)
//			System.out.printf("%-5.2f", doubles[i]);
//		System.out.println();
		
		nums = new int[] {12, 3, 56, 67, 13, 1000, 25, 75, 34};
		
		int min = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] < min) min = nums[i];
		}
		
		System.out.printf("Minimum: %d\n", min);
		
		// Bubble sort
		/*for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++)
				if (nums[i] > nums[j]) {
					int k = nums[j];
					nums[j] = nums[i];
					nums[i] = k;
				}
		}*/
		
		
		Integer[] nums2 = new Integer[] {12, 3, 56, 67, 13, 1000, 25, 75, 34};
		Arrays.sort(nums2, (a, b)->b.compareTo(a) );
		
		for(int i = 0; i < nums2.length; i++)
			System.out.printf("%-5d", nums2[i]);
		System.out.println();
		int[][] matrix = 
			{
				{1,2,3},
				{4,5},
				{6,7,8,9}
			};
		
		System.out.println(matrix.length);
		for(int i=0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++)
				System.out.printf("%-3d", matrix[i][j]);
			
			System.out.println();
		}
		
		
		int[][][] cube = 
			{
				{
					{1,2},
					{3,5},
					{5,6}
				},
				{ 
					{7,8},
					{9, 10}
				}
			};
		
		{
			int a = 10;
			int b = a;
			a++;
			System.out.printf("a = %d\nb = %d\n", a, b); // 11 10
		}
		{
			int[] a = {10};
			int[] b = a; // создание копии ссылки на тот же массив
			//int[] b = a.clone(); // создание копии массива (другой массив)
			
			a[0]++;
			System.out.printf("a = %d\nb = %d\n", a[0], b[0]); // 11 11
		}
		
		
		
		
		

	}

}
