// package alljava;

import java.util.Scanner;
/*
 * Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . . nth iteration.
 
 */

public class Niteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}
				
			
		}
	}

}
