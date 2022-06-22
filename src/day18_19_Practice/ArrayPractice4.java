package day18_19_Practice;

import java.util.Arrays;

public class ArrayPractice4 {

    public static void main(String[] args) {

        int[] num ={10,0,5,0,1,0};

        int[] moveZero=new int[num.length];

        for (int i = 0,j=0; i < num.length; i++) {
            if(num[i]!=0){ //if first index of num==0, skip. if does not => assign to first index of moveZero and j++
                moveZero[j]=num[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(moveZero));









        /*
        write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
         */
    }
}
