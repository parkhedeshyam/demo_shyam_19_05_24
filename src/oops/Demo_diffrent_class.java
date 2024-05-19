package oops;

class Example
{
	 public void display()
	 {
		 System.out.println("i am display mtd");
	 }
	 public void show()
	 {
		 System.out.println("i am show mtd");
	 }
}

public class Demo_diffrent_class {

	public static void main(String[] args) 
	{
		Example obj=new Example();
		obj.display();
		obj.show();

	}

}
