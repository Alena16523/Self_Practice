package day10_stringMethods;

import java.util.Scanner;

public class wordReplace {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word:");
        String word=input.next();

        boolean x = word.contains("x");
        boolean X=word.contains("X");

        if(x==true){
            String word1=word.replace("x", "a");
            System.out.println(word1);
        }else if(X==true){
            String word2=word.replace("X", "a");
            System.out.println(word2);
        }


    }

}
/*
Write a program that asks user to enter a word. and replace all the x or X with character a
	                    Input:
	                        xcodeX
	                    Output:
	                        acodea


 */