package day10_stringMethods;

import java.util.Scanner;

public class reallyWord {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.next();

        if(word.endsWith("ly")){
            System.out.println("Really?");
        }else{
            System.out.println("Never mind");
        }




    }
}

/*
4. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"



 */
