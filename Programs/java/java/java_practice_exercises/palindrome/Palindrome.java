public class Palindrome {

    public static void main(String[] args) {

        long num = 12345654321L;
        long reversedInteger = 0, remainder;
        long even_digit_sum=0;
        long originalInteger = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
        {
            long originalIntegercopy=originalInteger;
            while(originalInteger>0)
            {
                long digits= originalInteger % 10;
                if(digits%2==0) {
                    even_digit_sum+=digits;
                }
                originalInteger=originalInteger/10;
            }
            if(even_digit_sum>25)

            System.out.println(originalIntegercopy + " is a palindrome."+"sum of even digits is greater than 25");
            else
            System.out.println(originalIntegercopy + " is a palindrome."+"sum of even digits is less than 25");
        }
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}