package ru.specialist;

import java.util.Scanner;

public class App {
	
	public static int[] inputArray() {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите размер массива: ");
			int size = sc.nextInt();
			int[] nums = new int[size];
			for(int i=0; i < nums.length; i++) {
				System.out.printf("m[%d] = ", i);
				nums[i] = sc.nextInt();
			}
			return nums;
		}
	}
	
	public static int[] analyzeArray(int[] nums) {
		if (nums == null || nums.length == 0)
			throw new IllegalArgumentException("nums is null or empty array");
		
		int min = nums[0];
		int max = nums[0];
		int summa = 0;
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] < min) min = nums[i];
			if (nums[i] > max) max = nums[i];
			summa += nums[i];
		}
		return new int[] {min, max, summa};
	}
	

	public static void main(String[] args) {
		int[] m = inputArray();
		int[] r = analyzeArray(m);
		System.out.printf("Min: %d\nMax: %d\nSum: %d\n", r[0], r[1], r[2]);
	}

}
