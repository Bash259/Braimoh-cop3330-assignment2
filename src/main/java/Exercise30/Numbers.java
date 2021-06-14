/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */
package Exercise30;

public class Numbers {

        public String NumbersA(int num) {
            for(int i = 1; i <= 12; ++i)
            {
                System.out.printf("%s\t",num * i);
            }
            return "1 2 3 4 5 6 7 8 9 10 11 12" ;
        }
    }
