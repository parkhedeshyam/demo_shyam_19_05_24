package com.basic_program;

public class Palindrome_Str {

	public static void main(String[] args) {

	 String str = "amol";
		//String str = "madam";
		String Ori_Str = str;
		String Revstr1 = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			Revstr1 = ch + Revstr1;
		}
		System.out.println(Revstr1);

		if (Ori_Str.equals(Revstr1)) {
			System.out.println("String is PAlindrome");
		} else {
			System.out.println("String is not PAlindrome");
		}
	}
}
