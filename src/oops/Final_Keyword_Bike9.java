package oops;
class Final_Keyword_Bike9 {
	final int speedlimit = 90;// final variable

	void run() {
		speedlimit = 400;
	}

	public static void main(String args[]) {
		Final_Keyword_Bike9 obj = new Final_Keyword_Bike9();
		obj.run();
	}
}// end of class
