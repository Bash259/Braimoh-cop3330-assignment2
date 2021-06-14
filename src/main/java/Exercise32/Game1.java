/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */
package Exercise32;

import java.util.Scanner;

public class Game1 {
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(10 * Math.random());

        int K = 100;

        int i, guess;

        System.out.println("I have my number. What's your guess?");

        for (i = 0; i < K; i++) {

            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("You got it in " + (i+1) + " guesses!");
                break;
            }
            else if (number > guess
                    && i != K - 1) {
                System.out.println("Too low guess again: ");
            }
            else if (number < guess
                    && i != K - 1) {
                System.out.println("Too high guess again: ");
            }
        }

        if (i == K) {
            System.out.println("You got it in " + (i+1) + " guesses.");

        }
    }
}
