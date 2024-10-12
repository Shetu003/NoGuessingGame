import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = 1 + random.nextInt(100);
        int maxAttempts = 10;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("A number has been chosen between 1 and 100.");
        System.out.println("Your task is to guess the number within " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You've guessed the correct number.");
                break;
            } else if (guess > secretNumber) {
                System.out.println("The secret number is higher than your guess.");
            } else {
                System.out.println("The secret number is lower than your guess.");
            }

            attempts++;
        }

        if (attempts == maxAttempts) {
            System.out.println("You have exhausted all " + maxAttempts + " attempts.");
            System.out.println("The secret number was " + secretNumber);
        }

        scanner.close();
    }
}
