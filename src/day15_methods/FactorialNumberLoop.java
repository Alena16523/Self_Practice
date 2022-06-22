package day15_methods;

import java.util.Scanner;

public class FactorialNumberLoop {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=input.nextInt();

        int result=1;

        for (int i = 1; i <=num ; i++) { // 1*2*3*4*5 if num==5
            result*=i;
        }
        System.out.println(result);

    }

}
/*
 Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */