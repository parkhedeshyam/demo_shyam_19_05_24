package com.array;

public class Max_Number_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int max = arr[0];
		for (int a : arr) {
			if (a > max)
				max = a;
			System.out.println(a);
		}
		System.out.println("max number is " + max);

	}

}
