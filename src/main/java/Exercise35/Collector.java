package Exercise35;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Collector {
    private static final Scanner UserInput = new Scanner(System.in);
    public void CollectorA(){
        ArrayList<String> Names = new ArrayList<>();
       for (int i = 0;i <Integer.MAX_VALUE;++i){
            System.out.println("Enter a name:");
            String Name = UserInput.nextLine();
            Names.add(Name);
            if (Name.isEmpty()){
                Names.remove(i);
                int number =  (int)(i * Math.random());
                System.out.println("The winner is..." + Names.get(number));
                break;
            }else {
                continue;
            }
        }
    }
}
