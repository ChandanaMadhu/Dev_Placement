package com.sunrizeit;

import java.util.Scanner;

/*1. How do you reverse a String
 1. Declare input string,output string character(char ch),Length,declare a int i
 2. Get input length
 3. i<length ch=input.charAt(i)
 4. outputstring=ch+outputString
 	Example :
 	for (int i = 0; i < length; i++) {
			ch = input.charAt(i);
			revereString = ch + revereString;

		}
*/
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
