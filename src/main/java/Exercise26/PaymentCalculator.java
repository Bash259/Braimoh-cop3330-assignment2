/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */
package Exercise26;

import static java.lang.Math.log;

public class PaymentCalculator {
    double NumOfMonths;
    double DailyRate;
    double Balance;
    double MonthlyPay;

    public String CalculateMonthsUntilPaidOff(double DailyRate,double Balance,double MonthlyPay){

        double i  =  -(1.0/30.0);
        double l =  (1 + DailyRate);
        double y =  Math.pow(l,30);
        double x =  (Balance/MonthlyPay);
        double j =  log(1 + x * (1 - y));
        double k=  log(1 + DailyRate);
        double m =  (i * (j/k));
        String Output ="It will take you " + Math.ceil(m) + " months to pay off this card.";
        return Output;
        //return (float) (NumOfMonths = -(1/30) * log(1 + Balance/MonthlyPay * (1 - Math.pow((1 + DailyRate),30))) / log(1 + DailyRate));
    }
}
