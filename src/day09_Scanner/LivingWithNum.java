package day09_Scanner;

import java.util.Scanner;

public class LivingWithNum {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("How many people do you live with?");
        int numberOfPeople = input.nextInt();

        String result = (numberOfPeople>=0 && numberOfPeople<3)?"Live with less than 3 people"
                :(numberOfPeople>=3 && numberOfPeople<=6)? "Live with 3-6 people"
                : "Live with more than 6 people";

        System.out.println(result);

        input.close();

    }

}
