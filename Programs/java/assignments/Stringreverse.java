package assignments;
import java.util.Scanner;
public class Stringreverse {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("enter string");
	String str1 = str.next();
	      // String str1 = "london";
	      String str2 = "";
	   
	      for (int i=str1.length()-1; i>=0; i--) {
	        str2 += str1.charAt(i);
	      }
	   
	   System.out.println("The reversed string is: " +str2);
	   
	    }

}
