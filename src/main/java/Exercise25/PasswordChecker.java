/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */
package Exercise25;

import java.util.*;

public class PasswordChecker {


    public String passwordStrength(String input) {
        // Checking lower alphabet in string
        int n = input.length();
        boolean hasLower = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray()) {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }
        String Output = new String();

        if (hasDigit && hasLower &&  specialChar && (n >= 8)) {
            Output = "The password '" + input + "' is a very strong password.";
            System.out.println("The password '" + input + "' is a very strong password.");
            return Output;
        }
        else if ((hasLower || hasDigit) && (n >= 8)) {
           Output ="The password '" + input + "' is a strong password.";
            System.out.println("The password '" + input + "' is a strong password.");
           return Output;
        }
        else if (hasLower && (n < 8)) {
           Output ="The password '" + input + "' is a weak password.";
            System.out.println("The password '" + input + "' is a weak password.");
            return Output;
        }
        else if (hasDigit && (n < 8)) {
           Output = "The password '" + input + "' is a very weak password.";
            System.out.println("The password '" + input + "' is a very weak password.");
            return Output;
        }
        return Output;
    }
}