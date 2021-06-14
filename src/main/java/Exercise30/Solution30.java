/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */
package Exercise30;

public class Solution30 {
    public static void main(String[] args) {
        Numbers One = new Numbers();
        Iterator(One);
    }

    private static void Iterator(Numbers One) {
        int x = 12;
        int i = 1;
        while ( i <= x){
            One.NumbersA(i);
            System.out.println(" ");
            i++;
        }
    }

}
