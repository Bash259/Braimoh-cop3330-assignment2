/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */
package Exercise31;

public class Calculator {
    public void CalculatorA(double Pulse, double Age){
        System.out.println("Intensity    | Rate");
        System.out.println("-------------------");
        for(double i = 0.55; i <= 1; i+=0.05)
        {
            double x = i * 100;
            System.out.printf("%.0f%%          | %.0f bpm\n",x,((((220 - Age) - Pulse) * i) + Pulse) );
        }
    }
}
