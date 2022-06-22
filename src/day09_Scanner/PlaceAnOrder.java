package day09_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String product = input.nextLine();

        System.out.println("Enter price: ");
        double price =input.nextDouble();

        System.out.println("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.println("Enter your first name: ");
        String name=input.next();

        double totalCost = quantity*price;


        System.out.println(name+", your order for "+quantity+" "+product+" has been placed. Your total is "+totalCost);

        input.close();
    }

}
