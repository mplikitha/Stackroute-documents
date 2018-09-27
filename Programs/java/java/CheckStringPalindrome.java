package PracticeEx2;

import java.util.Scanner;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
		System.out.println("enter string");
	String str1 = str.next();
	String originalstring=str1;
	     
	      String str2 = "";
	   
	      for (int i=str1.length()-1; i>=0; i--) {
	        str2 += str1.charAt(i);
	      }
	   
	   System.out.println("The reversed string is: " +str2);
	   
	    
	if(originalstring==str2) {
	System.out.println("The string "+originalstring+" is palindrome");	
	}
	else
		System.out.println("The string "+originalstring+" is not a palindrome");	
	
	}
}


