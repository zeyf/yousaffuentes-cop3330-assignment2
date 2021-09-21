package ex32;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Random;

/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Let's play Guess the Number!\n");

        int difficulty, randomNumber = 0;

        // preknown minimum and maximum numbers per difficulty
        final int difficulty1min = 1, difficulty1max = 10,
                difficulty2min = 1, difficulty2max = 100,
                difficulty3min = 1, difficulty3max = 1000;


        boolean keepPlaying = true;

        // while a player wants to keep playing, keep playing
        while (keepPlaying) {

                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                difficulty = s.nextInt();

                // picks a number based on the difficulty chosen wihtin respective ranges
                if (difficulty == 1)
                    randomNumber = randInRange(difficulty1min, difficulty1max);
                else if (difficulty == 2)
                    randomNumber = randInRange(difficulty2min, difficulty2max);
                else if (difficulty == 3)
                    randomNumber = randInRange(difficulty3min, difficulty3max);

                System.out.print("I have my number. What's your guess? ");

                int guessCount = 0, guess = 0;
                // sets the default guesscount and guess at the beginning of a game

                // while the guess is not equal to the random number within the range for the current difficulty's min and max
                while (guess != randomNumber) {

                    try {

                        guess = s.nextInt();
                        guessCount++;

                        // check the guess's position vs the randomNumber
                        if (guess < randomNumber)
                            System.out.print("Too low. Guess again: ");
                        else if (guess > randomNumber)
                            System.out.print("Too high. Guess again: ");
                        else {
                            System.out.print(String.format("You got it in %d guesses!\n", guessCount));
                            break;
                        };

                    } catch (InputMismatchException ex) {
                        // counts invalid input as a guess
                        guessCount++;
                    };

                };



            System.out.print("Do you wish to play again (y/n)? ");
            String response = s.next();

            boolean playAgainStatus = verifyPlayAgain(response);

            // if true play again and resets guess and guess count to 0
            if (playAgainStatus)
                continue;
            else if (!playAgainStatus)
                break;

        };

    };

    // calculates and returns a random number within the min and the max
    public static int randInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    };

    // verifies if a player wants to play agian and returns a boolean to verify the play again status
    public static boolean verifyPlayAgain(String response) {

        if (response.charAt(0) == 'y')
            return true;
        else if (response.charAt(0) == 'n')
            return false;

        return false;
    };

}
