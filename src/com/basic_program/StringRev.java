package com.basic_program;

public class StringRev {

	public static void main(String[] args) {

		String str = "amol";
		String Revstr1 = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			Revstr1 = ch + Revstr1;
		}
		System.out.println(Revstr1);

	}

}
