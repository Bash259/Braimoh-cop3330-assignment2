/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */
package Exercise26;

import java.util.Scanner;

public class Solution26 {
    private static final Scanner UserInput = new Scanner(System.in);
    public static void main(String[] args) {
        //Output
        PaymentCalculator A = new PaymentCalculator();
        double Balance = Balance("What is your balance?");
        double APR = APRCalculator("What is the APR on the card (as a percent)?");
        double Monthly = MonthlyPay("What is the monthly payment you can make?");
        System.out.println(A.CalculateMonthsUntilPaidOff(APR,Balance,Monthly));
    }

    private static double MonthlyPay(String Prompt) {
        System.out.println(Prompt);
        double monthly = UserInput.nextDouble();
        return monthly;
    }

    private static double APRCalculator(String Prompt) {
        System.out.println(Prompt);
        double APR = UserInput.nextDouble();
        double x = APR /100 ;
        double i = x/365;
        return i;
    }

    private static double Balance(String Prompt) {
        System.out.println(Prompt);
        double balance = UserInput.nextDouble();
        return balance;
    }
}
