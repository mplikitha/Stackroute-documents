import java.util.Scanner;
public class IntegerAdd {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of arguments: ");
        int n = input.nextInt();
        System.out.println("enter the numbers");
        int a[]= new int[n];
        int sum=0;
        for(int i=0; i<n; i++){
            a[i]=input.nextInt();
        sum=sum+a[i];
        }
        System.out.println("number of arguments entered is "+n)
        System.out.println("sum of entered "+n+" nmbers is " +sum);

    }
}