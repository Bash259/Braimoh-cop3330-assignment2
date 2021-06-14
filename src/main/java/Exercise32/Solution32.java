/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise32;

import java.util.Scanner;

public class Solution32 {

    private static final Scanner UserInput = new Scanner(System.in);

    public static void main(String[] args) {
        Game();
        Iterator();
    }

    private static void Iterator() {
        while (true) {
            System.out.println("Do you wish to play again (Y/N)?");
            String In1 = UserInput.next();
            switch (In1){
                case "y":
                    Game();
                    continue;
                case "n":
                    break;
                default:
                    System.out.println("Please pick between y/n");
            }
            break;
        }
    }

    private static void Game() {
        System.out.println("Let's play Guess the Number!\n");
        System.out.println("Enter the difficulty level (1, 2, or 3):");
        int In = UserInput.nextInt();
        switch (In){
            case 1:
                Game1 One = new Game1();
                Game1.guessingNumberGame();
                break;
            case 2:
                Game2 Two = new Game2();
                Game2.guessingNumberGame();
                break;
            case 3:
                Game3 Three = new Game3();
                Game3.guessingNumberGame();
                break;
            default:
                System.out.println("Invalid Input(Enter a number that is between 1 and 3 (Inclusive))");
        }
    }

}
