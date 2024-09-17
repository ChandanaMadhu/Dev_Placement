package com.sunrizeit;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String input = sc.next();
		int length = input.length();
		String revereString = "";
		char ch;
		for (int i = 0; i < length; i++) {
			ch = input.charAt(i);
			revereString = ch + revereString;

		}
		System.out.println(revereString);
	}

}
