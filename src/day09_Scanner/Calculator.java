package day09_Scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNum = input.nextDouble();

        System.out.println("Enter your math operator: ");
        char mathOper = input.next().charAt(0);

        System.out.println("Enter the second number: ");
        double secondNUm = input.nextDouble();


        switch (mathOper){
            case '+':
                System.out.println(firstNum+secondNUm);
                break;
            case'-':
                System.out.println(firstNum-secondNUm);
                break;
            case '*':
                System.out.println(firstNum*secondNUm);
                break;
            case '/':
                System.out.println(firstNum/secondNUm);
                break;
            default:
                System.out.println("Invalid entry");
        }

        input.close();





    }
}
