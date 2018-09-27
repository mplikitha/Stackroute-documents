// package alljava;

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		System.out.println("Enter string" );  
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		String[] st=str.split("\\s");
		for(String s1:st) {
			System.out.println(s1);
		}

	}

}
