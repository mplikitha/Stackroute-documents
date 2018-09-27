package assignments;
import java.util.Scanner;

public class NumberGuessGame {
	public static void main(String[] args) {

        int secretNumber;
// creating a random number
        secretNumber = (int) (Math.random() * 99 + 1);           

        Scanner keyboard = new Scanner(System.in);

        int guess;

        do {

              System.out.print("Enter a guess (1-100): ");

              guess = keyboard.nextInt();

              if (guess == secretNumber)

                    System.out.println("Your guess is matches the original number. Congratulations!");

              else if (guess < secretNumber)

                    System.out

                               .println("Your guess is smaller than the secret number.");

              else if (guess > secretNumber)

                    System.out

                               .println("Your guess is greater than the secret number.");

        } while (guess != secretNumber);

  }


}
