import java.util.Scanner;
public class CheckVowelConsonent {

    public static void main(String[] args) {
        // String line = "vowel";
        int vowels = 0, consonants = 0;
        String line;
		System.out.println("Enter word" );  
		Scanner s=new Scanner(System.in);
		line=s.nextLine();

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
                System.out.println(ch+" is a Vowel");
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
                System.out.println(ch+" is a consonant");
            }
            
        }
    }
}