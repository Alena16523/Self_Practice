package day09_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your hourlyRate: ");
        int rate = input.nextInt();

        System.out.println("How many hours do you work per week?");
        int hours =input.nextInt();

        System.out.println("Enter state tax(in percentage): ");
        int stateTax=input.nextInt();

        System.out.println("Enter federal tax (in percentage): ");
        int federalTax=input.nextInt();

        int salary=(rate*hours)*52;
        int stateTaxRes=(salary*stateTax)/100;
        int federalTaxRes=(salary*federalTax)/100;
        int totalTax=stateTaxRes+federalTaxRes;
        int netIncome=salary-totalTax;

        System.out.println("Your salary is:  " + salary);
        System.out.println("Your state tax is: " + stateTaxRes);
        System.out.println("Your federal tax is: " + federalTaxRes);
        System.out.println("Your total tax is: " + totalTax);
        System.out.println("Your net income is: " + netIncome);

        input.close();



    }

}
