package oops;

import java.util.Scanner;
class Example_Method_Overloding_Area {

	public void area(double r) 
	{
		double area=3.14*r*r;
		System.out.println("Area of circle "+area);
	}
	public void area(int l, int b) {
		
		double area=l*b;
		System.out.println("Area of rect "+area);
	}

	public void area(int side) {
		double area=side*side;
		System.out.println("Area of square  "+area);

	}
}

public class Method_Overloding_Area {

	public static void main(String[] args) {
		Example_Method_Overloding_Area  x = new Example_Method_Overloding_Area();
		
		x.area(7, 7);
		x.area(7);
		x.area(7.5);

	}

}
