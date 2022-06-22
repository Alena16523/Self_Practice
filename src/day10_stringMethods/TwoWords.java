package day10_stringMethods;

import java.util.Scanner;

public class TwoWords {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter first word:");
        String firstWord=input.next();

        System.out.println("Enter second word:");
        String secondWord=input.next();

        if (firstWord.charAt(firstWord.length() - 1) == secondWord.charAt(0)) {
            secondWord = secondWord.substring(1);
            firstWord=firstWord.substring(0,(firstWord.length() - 1));
            System.out.println(firstWord + secondWord);
        } else {
            System.out.println(firstWord + secondWord);
        }

        input.close();
    }
}
/*
6. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight

 */