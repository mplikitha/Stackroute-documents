import java.util.Scanner;
public class Descendingorder {

    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("sorted number in non increasing order ");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.println(a[i]);
        }
        System.out.println(a[n - 1]);
        int sum=0;
        for(int i=0; i<n;i++) {
            if(a[i]%2==0)
            {
            sum=sum+a[i];

            }
        }
        System.out.println("sum of even numbers is: "+sum);
        if(sum>=15)
        System.out.println("True");
        else 
        System.out.println("False") ;     
    }
}
