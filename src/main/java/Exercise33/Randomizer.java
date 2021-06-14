/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise33;

import java.util.ArrayList;

public class Randomizer {
    public void RandomizerA(){
        ArrayList<String> EightBall = new  ArrayList<String>();
        EightBall.add("Yes.");
        EightBall.add("No.");
        EightBall.add("Maybe.");
        EightBall.add("Ask again later.");
        int number =  (int)(4 * Math.random());
        System.out.println(EightBall.get(number));
    }
}
