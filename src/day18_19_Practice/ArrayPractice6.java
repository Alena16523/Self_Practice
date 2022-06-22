package day18_19_Practice;

import java.util.Arrays;

public class ArrayPractice6 {

        public static void main (String[] args) {

            String sentence = "I Love Java";
            String[] array = sentence.split(" ");

            String reversedSecond = "";
            for (int i = array[1].length() - 1; i >= 0; i--) {
                reversedSecond += array[1].charAt(i);
            }
            array[1] = reversedSecond;

            for ( String each : array ) {
                System.out.print(each + " ");
            }








        }

    /*
    Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java

     */
}
