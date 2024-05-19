package oops;

import java.util.Scanner;

class Example_Method_Overloding {

	public void sumt(int x,int y) 
	{
		System.out.println("sum of two parameter "+(x+y));
	
	}

	public void sumt(int x, int y, int z) {
		System.out.println("sum of three parameter " + (x + y + z));

	}

	public void sumt(int w, int x, int y, int z) {
		System.out.println("sum of four parameter " + (w + x + y + z));

	}
}

public class Method_Overloding {

	public static void main(String[] args) {
		Example_Method_Overloding  x = new Example_Method_Overloding();
		x.sumt(1, 2);
		x.sumt(1, 2, 3);
		x.sumt(1, 2, 3, 4);

	}

}
