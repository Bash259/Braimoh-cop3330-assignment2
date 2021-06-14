/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */
package Exercise25;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner UserInput = new Scanner(System.in);
    public static void main(String[] args) {
    PasswordChecker Pass = new PasswordChecker();
    Pass.passwordStrength(collector("Enter password"));

    }

    private static String collector(String Prompt) {
        System.out.println(Prompt);
        String input = UserInput.nextLine();
        return input;
    }
}
