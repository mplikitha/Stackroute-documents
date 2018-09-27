// package alljava;

import java.util.Scanner;
/*
 * Write a program that takes a character from the user as input and determines whether the character entered is a capital letter, a small case letter, a digit or a special symbol and display appropriately.
 */

public class DetermineChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i ;
		System.out.println("Enter character");
		Scanner s=new Scanner(System.in);
		i=s.next().charAt(0);
		if(i>='A'&&i<='Z') {
			System.out.println("Capital Letter");
		}

		else if(i>='a'&&i<='z') {
			System.out.println("Small case Letter");
		}
		else if(i>=48&&i<=57) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Symbol");
		}

	}

}
