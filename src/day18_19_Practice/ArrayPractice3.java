package day18_19_Practice;

import java.util.Arrays;

public class ArrayPractice3 {
    public static void main(String[] args) {

       int[] given={1,2,3,4,5};

       int[] reversed=new int[given.length]; //same length as given array

        for (int i = given.length - 1, j=0; i >= 0; i--, j++) { //start given array from the back, and assign to the reversed from the front using j
            reversed[j]=given[i];
        }

        System.out.println(Arrays.toString(reversed));

    }

    /*
    Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
     */
}
