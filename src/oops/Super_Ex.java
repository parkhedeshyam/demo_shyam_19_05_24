package oops;
class A
{
	int a=5;
	  public void display()
	 {
		  System.out.println("a= "+a); 
	 }
}
class B extends A
{
	int a=10 ,ans;
	
	public void add()
	{
		ans=super.a+a;
	}
	  public void display()
	 {
		  super.display();
		  System.out.println("add is " +ans); 
	 }
}
public class Super_Ex {

	public static void main(String[] args) {
		B obj =new B();
		obj.add();
		obj.display();
	}
}
