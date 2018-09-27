import java.util.Scanner;
class EvenorOdd
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);  
    
      System.out.println("Enter an integer between 20 to 30 to check if it is odd or even ");
      int number=sc.nextInt();  
     
      if ( number % 2 == 0)
      {
          if(number>=20 && number<=30)
         System.out.println("Jerry");
      }
      else
      if(number>20 && number<30)
         System.out.println("Tom");
   }
}