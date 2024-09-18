package com.sunrizeit;

import java.util.InputMismatchException;
import java.util.Scanner;

/*2.How do you swap two numbers without using a third variable
 a=a+b
 b=a-b
 a=a-b
 or 
 b=a+b
 b=b-a
 a=b-a
 */
public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Before swapping values : ");
		System.out.println("-----------------------");
		try {
		System.out.print("Enter a Value: ");
		a=sc.nextInt();
		System.out.print("Enter B value: ");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\nAfter swapping numbers");
		System.out.println("----------------------");
		System.out.println("A value is : "+a);
		System.out.println("B value is : "+b);
		}catch(InputMismatchException e ) {
			System.out.println("Enter number value only");
		}
		



	}

}
