
import java.util.Random;
import java.util.Scanner;

public class assignment2application {

	public static void main(String[] args) {

		Random randomNumber = new Random();
		Scanner scanner = new Scanner(System.in);

		int guessMe = randomNumber.nextInt(100) + 1;

		System.out.println("Let's play a game! I'm thinking of a number between 1-100. What is it?");

		int attempts = 0;
		boolean correct = false;

		while (!correct && attempts < 5) {
			System.out.print("Enter your guess: ");
			int guess = scanner.nextInt();

			if (guess < 1 || guess > 100) {
				System.out.println("Your guess is out of range! Please guess a number between 1 and 100.");
			} else {
				attempts++;

				if (guess < guessMe) {
					System.out.println("Pick a higher number! Try again.");
				} else if (guess > guessMe) {
					System.out.println("Pick a lower"
							+ " number! Try again.");
				} else {
					System.out.println("Hooray! You correctly guessed the number " + guessMe + " correctly in "
							+ attempts + " attempts!");
					correct = true;
				}
			}
		}

		if (!correct) {
			System.out.println("Sorry, you've used all your attempts. The correct number was " + guessMe);
		}

		scanner.close();
	}
}
