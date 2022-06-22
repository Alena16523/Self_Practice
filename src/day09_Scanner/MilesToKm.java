package day09_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles: ");
        double miles=input.nextInt();

        double km = miles/1.609344;

        System.out.println(miles+ " equal to "+km+ " kilometers");

        input.close();

    }

}
