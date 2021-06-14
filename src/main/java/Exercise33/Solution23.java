/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise33;

import java.util.Scanner;

public class Solution23 {
    private static final Scanner UserInput = new Scanner(System.in);
    public static void main(String[] args) {
        //Store 4 arrays
        //make a method that asks for input
        Randomizer A = new Randomizer();
        QuestionGetter(A);

    }

    private static void QuestionGetter( Randomizer A) {
        System.out.println("What's your question?");
        String Question = UserInput.next();
        System.out.println(" ");
        A.RandomizerA();
    }

}
