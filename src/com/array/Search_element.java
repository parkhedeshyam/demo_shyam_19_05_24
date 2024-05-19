package com.array;

public class Search_element {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int serach = 5;
		int flag = 0;
		for (int a : arr) {
			if (a == serach) {
				flag = 1;
				break;
			}

		}
		System.out.println(flag);
		if (flag == 1)
			System.out.println("Element is found");
		else
			System.out.println("Element is not found");

	}

}
