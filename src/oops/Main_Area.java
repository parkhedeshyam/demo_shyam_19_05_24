package oops;

import java.util.Scanner;

class Area_circle {
	float r;
	float area;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter the r ");
		r = sc.nextFloat();
	}

	public void display_area() {
		area =(float) (3.14 * r * r);
		System.out.println("The area of circle is  " + area);
	}
}

public class Main_Area {

	public static void main(String[] args) {
		Area_circle x = new Area_circle();
		x.accept();
		x.display_area();

	}

}
