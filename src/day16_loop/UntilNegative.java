package day16_loop;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        System.out.println("Enter your number: ");
        int given=input.nextInt();

        int sum=0;

       while(given>=0){
           sum+=given;
           System.out.println("Enter your number: ");
           given=input.nextInt();
       }

        System.out.println(sum);

    }
}
