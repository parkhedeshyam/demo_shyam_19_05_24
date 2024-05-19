package oops;
class Constrcutor_Ex
{
	public void display()
	{
		System.out.println("display Method called");
	}
	public Constrcutor_Ex()
	{
		System.out.println("Constrcutor Method called");
	}
}
public class Main_Constrcutor{

	public static void main(String[] args) {
		Constrcutor_Ex x=new Constrcutor_Ex();
		x.display();
	}

}
