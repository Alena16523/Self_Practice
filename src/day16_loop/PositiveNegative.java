package day16_loop;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int negative=0;
        int positive =0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your number: ");
            int num=input.nextInt();

            if(num<0){
                negative+=1;
            }else{
                positive+=1;
            }
        }

        System.out.println(negative+" negative and "+positive+" positive");

    }

}
/*
Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative


 */