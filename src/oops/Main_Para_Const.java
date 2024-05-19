package oops;

class DemoClass {
// data members of the class.
	String name;
	int id;

// parameterized constructor called when object is created
	DemoClass(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

class Main_Para_Const 
{
public static void main (String[] args)
{
// this will invoke the parameterized constructor.
DemoClass dc1 = new DemoClass("Java", 1);
System.out.println("Tutorial Name :" + dc1.name + ", Id :" + dc1.id);
}
}