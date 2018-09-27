package assignments;

import java.util.Scanner;

public class RepeatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner str = new Scanner(System.in);
		System.out.println("enter number of n charecters to be repeated n times");
		 int n = str.nextInt();
		 System.out.println("enter string");
		 String input;
		 input=str.next();
		 
		String substr = input.substring(input.length()-n);
		
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; ++i)
		{ 
		    sb.append(substr);
		}
		String result = sb.toString();
		System.out.println(input+result);
		
		
		    }
	

}
