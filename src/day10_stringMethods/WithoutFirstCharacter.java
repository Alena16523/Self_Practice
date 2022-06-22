package day10_stringMethods;

import java.util.Scanner;

public class WithoutFirstCharacter {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter 2 words:");
        String twoWords = input.nextLine();

        int index2=twoWords.indexOf(" ");
        String firstWord = twoWords.substring(1,index2);

        String secondWord=twoWords.substring(index2+2);

        System.out.println(firstWord+secondWord);
    }
}
/*
Medium Spicy:
	5. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */