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

        final int difficulty1min = 1, difficulty1max = 10,
                difficulty2min = 1, difficulty2max = 100,
                difficulty3min = 1, difficulty3max = 1000;

        Random r = new Random();

        boolean keepPlaying = true;

        while (keepPlaying) {

            try {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                difficulty = s.nextInt();

                if (difficulty == 1)
                    randomNumber = r.nextInt() % (difficulty1max - difficulty1min + 1) + difficulty1min;
                else if (difficulty == 2)
                    randomNumber = r.nextInt() % (difficulty2max - difficulty2min + 1) + difficulty2min;
                else if (difficulty == 3)
                    randomNumber = r.nextInt() % (difficulty3max - difficulty3min + 1) + difficulty3min;

                System.out.print("i have my number. What's your guess? ");

                int guessCount = 0, guess = 0;

                // first guess
                guess = s.nextInt();
                guessCount++;

                while (guess != randomNumber) {
                    if (guess < randomNumber)
                        System.out.print("Too low. Guess again: ");
                    else if (guess > randomNumber)
                        System.out.print("Too high. Guess again: ");
                    else {
                        System.out.print(String.format("You got it in %d guesses!", guessCount));
                        break;
                    };

                    guess = s.nextInt();
                    guessCount++;
                };

            } catch (InputMismatchException ex) {
                s.next();
                System.out.println("Enter numeric data.");
            };

        };

    };

}
