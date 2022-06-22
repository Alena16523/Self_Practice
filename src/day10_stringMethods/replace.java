package day10_stringMethods;

import java.util.Scanner;

public class replace {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word:");
        String word=input.next();

        if(word.startsWith("x")){
           word= word.replace("x","a");
            System.out.println("word = " + word);
        }

    }
}

/*
Write a program that asks user to enter a word. If the work starts with x, replace it with a.
	                    Input:
	                        xcodex
	                    Output:
	                        acodex


 */
