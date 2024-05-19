package oops;
//The initialization of an object by using reference is shown in the program below.
class Student
{
	int rollno;
	String name ;
}
public class Example_Object {

	public static void main(String[] args) 
	{
		Student x=new Student();
		x.rollno=123;
		x.name="Amol";
		
		System.out.println(x.rollno);
		System.out.println(x.name);
	}
}
