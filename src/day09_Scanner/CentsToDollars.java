package day09_Scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents amount: ");
        int cents = input.nextInt();

        int dollars = cents/100;
        int leftOverCents = cents%100;

        System.out.println(cents+" equals to: "+dollars+ " dollars and "+leftOverCents+" cents");

        input.close();



    }

}
