/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise36;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberCollector {
    private static final Scanner UserInput = new Scanner(System.in);
    public ArrayList<Double> NumberCollectorA(){
        ArrayList<Double> Doubles = new ArrayList<>();
        for (int i = 0;i < 100;++i){
            System.out.println("Enter a Number:");
            String In = UserInput.nextLine();
            if (In.equals("done")){
                System.out.println("Numbers: " + Doubles);
                break;
            }else {
                double Number = Double.parseDouble(In);
                Doubles.add(Number);
                continue;
            }
        }
        return Doubles;
    }
    public double average(ArrayList<Double> entry){
        System.out.println(entry.size());
        int x =entry.size();
        int i;
        for (i = 0; i <= x; ++i){
            double value = entry.get(i);
            value += value;
            if (i == x){
                System.out.println(value);
                double avg = value/entry.size();
                System.out.println("The average is " + avg);
                return avg;
            }
        }
        return 0;
    }
}
