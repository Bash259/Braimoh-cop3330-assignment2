/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */
package Exercise29;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution29 {
    private static final Scanner UserInput = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            String A = NumberRequest();
            boolean x = PreventNoneStringAndZero(A);

            if (x) {
                Calculator(NumberCollector(A));
                break;
            } else {
                System.out.println("Sorry.That's not a valid input");
            }
        }
    }


    private static double Calculator(double ok) {
        double years = 72.0/ok;
        System.out.println("It will take " + years + " years to double your initial investment.");
        return years;
    }

    private static String NumberRequest() {
        System.out.println("What is the rate of return?");
        String RoR = UserInput.nextLine();
        return RoR;
    }
    private static double NumberCollector(String str) {
        double i = Double.parseDouble(str);
        return i;
    }
    private static boolean PreventNoneStringAndZero(String str) {
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if (Character.isDigit(c) && Integer.parseInt(str) !=0) {
                return true;
            }
        }
        return false;
    }
}
