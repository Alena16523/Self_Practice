package day16_loop;

import java.util.Random;
import java.util.Scanner;

public class PracticeRandom {

    public static void main(String[] args) {

        Random random=new Random();
        int number=random.nextInt(101);

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number1=input.nextInt();


            while(!(number1==number)){
                if(number1<number){
                    System.out.println("Your guess is too low, try again: ");
                    number1=input.nextInt();
                }else {
                    System.out.println("Your guess is too high, try again: ");
                    number1=input.nextInt();
                }
            }
            System.out.println("You guessed the number!!!!! Hooray!!!!");

    }
}
