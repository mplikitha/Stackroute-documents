package assignments;
import java.util.Scanner;

public class Nthiteration {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int number;
			System.out.println("Enter number");
			Scanner s=new Scanner(System.in);
			number=s.nextInt();
			for(int i=1;i<=number;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(i);
				}
					
				
			}
		}
}
