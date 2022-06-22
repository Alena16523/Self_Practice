package day09_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter current speed: ");
        int speed =input.nextInt();

        int speedLimit = 55;

        if(speed>speedLimit){
            System.out.println("You are driving "+(speed-speedLimit)+" mph over the limit. Slow down!");
        }

        input.close();
    }

}
