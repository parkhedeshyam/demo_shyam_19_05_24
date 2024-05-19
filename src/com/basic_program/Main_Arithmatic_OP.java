package com.basic_program;

public class Main_Arithmatic_OP {

	public static void main(String[] args) {
		
		Arithmatic_OP obj=new Arithmatic_OP();
		System.out.println("Add is "+obj.sum(4, 5));
		
		int ans_sub =obj.sub(4, 5);
		System.out.println("sub is "+ans_sub);
		
		System.out.println("mul is "+Arithmatic_OP.mul(4,5));
	}
}
