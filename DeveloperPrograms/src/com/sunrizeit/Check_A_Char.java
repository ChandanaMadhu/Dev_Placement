package com.sunrizeit;

import java.util.Scanner;

public class Check_A_Char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input String :");
		String input = sc.nextLine();
		int length = input.length();
		for (int in = 0; in < length; in++) {
			if (input.charAt(in) == 'a' || input.charAt(in) == 'e' || input.charAt(in) == 'i' || input.charAt(in) == 'o'
					|| input.charAt(in) == 'u') {
				System.out.println(input.charAt(in) + " is Vowel");
			} else {

			}

		}

	}
}
