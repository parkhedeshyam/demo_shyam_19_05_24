package com.array;
	public class Multidimetional_Array {
		public static void main(String[] args) {
			// Declaration and initialization of a two-dimensional integer array
			int matrix[][]  = new int[3][3];

			// Adding values to the array
			matrix[0][0] = 1;
			matrix[0][1] = 2;
			matrix[0][2] = 3;
			matrix[1][0] = 4;
			matrix[1][1] = 5;
			matrix[1][2] = 6;
			matrix[2][0] = 7;
			matrix[2][1] = 8;
			matrix[2][2] = 9;

			// Finding the size of the array
	int rows = matrix.length;
	int columns = matrix[0].length;
	System.out.println("Number of rows: " + rows);
	System.out.println("Number of columns: " + columns);

	// Reading a single value from the array
	int value = matrix[1][1];
	System.out.println("Value at row 1, column 1: " + value);

	// Reading multiple values from the array using nested loops
		System.out.println("All values in the array:");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println(); // Move to the next line after printing each row
			}
		}
	}


