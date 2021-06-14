/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise31;

import java.util.Scanner;

public class Solution31 {
    private static final Scanner UserInput = new Scanner(System.in);
    public static void main(String[] args) {

        Calculator A = new Calculator();
        A.CalculatorA(BpCollector("Resting pulse:"),AgeCollector("Age:"));

    }

    private static double AgeCollector(String prompt) {
        System.out.println(prompt);
        double Age = UserInput.nextDouble();
        return Age;
    }
    private static double BpCollector(String prompt) {
        System.out.println(prompt);
        double Bp = UserInput.nextDouble();
        return Bp;
    }
}
