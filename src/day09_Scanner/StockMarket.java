package day09_Scanner;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("How many total shares do you have?");
        int shares = input.nextInt();

        if(shares>0){
            System.out.println("How much their total value in the stock market?");
            double valueInMarket=input.nextDouble();

            input.nextLine();

            System.out.println("Enter company name you have the most shares in? ");
            String companySharesIn = input.nextLine();

            System.out.println(shares+", "+valueInMarket+", "+companySharesIn);
        }

        input.close();

        }


    }

