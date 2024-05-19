package oops;

public class Demo_Same_class {

	int a;
	int b;

	public static void display() {
		System.out.println("i am display mtd");
	}

	public void show() {
		System.out.println("i am show mtd");
	}

	public static void main(String[] args) {
		Demo_Same_class x = new Demo_Same_class();
		//x.display();
		x.show();
		
	display();

	}

}
