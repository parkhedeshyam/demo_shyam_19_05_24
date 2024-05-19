package oops;

class Example_2 {
	public void show() {
		System.out.println("show called ");
	}

	public void add(int a, int b) {
		System.out.println("Add is " + (a + b));
	}
}

public class Example_Test_2 {

	public static void main(String[] args) {

		Example_2 obj = new Example_2();
		obj.show();
		obj.add(5,4);
		
		new Example_2().show();
		new Example_2().add(15, 3);;
	}

}
