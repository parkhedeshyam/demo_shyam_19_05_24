package oops;

class EncapsulationEx {
	private int acc_no;
	private String Name;
	private int amount;

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void display() {
		System.out.println(acc_no + " " + Name + " " + amount);
	}
}

public class Main_Encapsulation {

	public static void main(String[] args) {

		EncapsulationEx obj = new EncapsulationEx();

		obj.setAcc_no(123466);
		System.out.println(obj.getAcc_no());
		// obj.acc_no = 12323;
		// obj.Name = "Anmol";
		// obj.amount = 12500;
		// obj.display();

	}

}
