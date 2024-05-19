package oops;

class Student_mtd
{
	int rollno;
	String Name;
	double per;
	
	public void acceptInfo(int a,String n,double p)
	{
		
		rollno=a;
		Name=n;
		per=p;
	}
	public void display()
	{
		System.out.println(rollno);
		System.out.println(Name);
		System.out.println(per);
	}
	
}

public class Mtd_Class_Example_2 {

	public static void main(String[] args) {
		
		Student_mtd x=new Student_mtd();
		x.acceptInfo(1, "Anmol", 70);
		x.display();
		
	}

}
