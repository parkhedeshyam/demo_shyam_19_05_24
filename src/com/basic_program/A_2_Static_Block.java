package com.basic_program;

//Java static block
//Is used to initialize the static data member.
//It is executed before the main method at the time of classloading.
class A_2_Static_Block {
	static 
	{
		System.out.println("static block is invoked");
	}

	public static void main(String args[]) 
	{
		System.out.println("Hello main");
	}
}