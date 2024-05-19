package oops;
class Demo
{
	int x;
	int y;
	Demo()
	{
		x=4;
		y=5;
	}
	public void display()
	{
		System.out.println("the value of x :"+x);
		System.out.println("the value of x :"+y);
	}
}
public class Main_Constrcutor_Ex2{

	public static void main(String[] args) {
		
		Demo x=new Demo();
		x.display();		
	}
}
