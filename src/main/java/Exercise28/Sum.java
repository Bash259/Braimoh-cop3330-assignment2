/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */
package Exercise28;

import java.util.Scanner;

public class Sum {
    private static final Scanner UserInput = new Scanner(System.in);
    public String SumA(){
        int sum = 0;
        int  x = 0;
        while (x < 5){
            System.out.println("Enter a number:");
            int y = UserInput.nextInt();
            sum = y + sum;
            x++;
        }
        return "The total is " + sum;
    }
}
