package oops;

class A1 {
	public void Display() {
		System.out.println("Display() Mtd from class A");
	}
}

class B1 {
	public void Display() {
		System.out.println("Display() Mtd from class B");
	}
}

class ZZ extends A1
{

	public void show() {
		System.out.println("Display() Mtd from class A");
	}
}

public class Why_Not_Main_Multiple_Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZZ obj = new ZZ();
		obj.Display();
		obj.Display();
	}

}
