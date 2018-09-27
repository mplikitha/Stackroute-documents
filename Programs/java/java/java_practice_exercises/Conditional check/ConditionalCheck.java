// package alljava;

import java.util.Scanner;

/*
 *  Write a program which accepts an integer number as input from the user and perform the following conditional checks:
    a. Print Tom if number is odd and exists between 20 to 30   
    b. Print Jerry, if number is even and exists between 20 and 30
 */

public class ConditionalCheck {
	
	
	public static void main(String args[]) {
		int x;
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		if(((x%2)!= 0) && (x>20 && x<30)) {
			System.out.println("Tom");
		}
		else if(((x%2)== 0) && (x>20 && x<30))
		{
			System.out.println("Jerry");
		}
		else {
			System.out.println("");
		}
		
	}

}
