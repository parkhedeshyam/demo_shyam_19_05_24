package oops;
class AAA
{
	public void display()
	{
		System.out.println("hi");
	}
}
public class Main_Demo {

	public static void main(String[] args) {
	 AAA obj=new AAA();
	 obj.display();
	 
	 new AAA().display();
	}

}
