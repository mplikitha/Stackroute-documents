package PracticeEx2;
import java.util.Scanner;
public class EvenNumTest {
	
	public static boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		//Scanner, variables
		Scanner input = new Scanner(System.in);
		int number;
 
		System.out.println("Please enter an integer number: ");
		number = input.nextInt();
		
 
		//output
		System.out.println("The entered number is " + number);
		System.out.println(isEven(number));// prints true if number is even
		
			
		}
 
		}
	
	
