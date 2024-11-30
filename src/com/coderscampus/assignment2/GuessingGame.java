package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		int maxNumberOfGuesses = 5;
		int guesses = 0;
		int theRandomNumber = new Random().nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to GUESS THAT NUMBER! Try to guess the number between 1 and 100");

		while (guesses < maxNumberOfGuesses) {
			System.out.print("Enter your guess (" + (guesses + 1) + "/" + maxNumberOfGuesses + "): ");

			if (!scanner.hasNextInt()) {
				System.out.println("Invalid input. Please enter a valid integer.");
				scanner.next();
				continue;
			}
			int userGuess = scanner.nextInt();

			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Your guess is not between 1 to 100. Please try again.");
			} else if (userGuess == theRandomNumber) {
				System.out.println("Congratulations! You guessed the number " + theRandomNumber + ". You win!");
				break;
			} else if (userGuess < theRandomNumber) {
				System.out.println("Not quite... Please pick a higher number.");
				guesses++;
			} else if (userGuess > theRandomNumber) {
				System.out.println("Dang, not quite... Please pick a lower number.");
				guesses++;
			}
		}
		if (guesses == maxNumberOfGuesses) {
			System.out.println("Sorry. The number to guess was " + theRandomNumber + ". Better luck next time!");
		}

		scanner.close();

	}
}
