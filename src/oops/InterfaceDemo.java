package oops;

interface Shape
{
	int length=10 ;// final & Static
	int width=20 ;// final & Static
	
	void circle();// abstract Method
	default void square()
	{
		System.out.println("This is square -Default Mtd");
	}
	static void rectangle()
	{
		System.out.println("This is rectangle -Static Mtd");
	}
	
 
}
public class InterfaceDemo implements Shape {

	@Override
	public void circle() {
System.out.println("This is circle -abstract  Mtd");
	
	}
	
	public void display()
	{
		System.out.println("This is display -display Mtd");
	}
	public static void main(String[] args) {
		
		//Scenario-1
		InterfaceDemo obj =new InterfaceDemo();
		obj.circle();//abstract  mtd
		obj.square(); //default  mtd  
		Shape.rectangle(); //static Mtd can directly 
						  //acces from Interface
		obj.display();
		
		//Scenario-2
		Shape sh = new InterfaceDemo();
		
		//Shape sh1 = new Shape();  //Cannot instantiate the type Shape
		sh.circle();
		sh.square();
		Shape.rectangle();  //static Mtd can directly 
		  					//acces from Interface
		
		//Shape sh = new Shape();
		sh.display();
	}

	

}
