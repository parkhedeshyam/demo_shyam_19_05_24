package oops;

class Static_Example {
	public void display() {
		System.out.println("Display called ");
	}
	public static void show() {
		System.out.println("show called ");
	}
}

public class Static_Example_Test {

	public static void main(String[] args) {
		Static_Example obj = new Static_Example();
		obj.display();

		Static_Example.show();

	}

}
