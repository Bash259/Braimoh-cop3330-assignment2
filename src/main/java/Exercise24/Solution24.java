/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */
package Exercise24;

import java.util.Scanner;

public class Solution24 {
    static String word1;
    static String word2;

    private static final Scanner UserInput = new Scanner(System.in);

    public static void main(String[] args) {
        Word1Collector("Enter first word:");
        Word2Collector("Enter second word:");

        anagramChecker Try1 = new anagramChecker();

        Try1.isAnagram(word1,word2);

    }

    private static String Word1Collector(String question) {
        System.out.println(question);
        word1 = UserInput.next();
        return word1;
    }

    private static String Word2Collector(String question) {
        System.out.println(question);
        word2 = UserInput.next();
        return word2;
    }


}
