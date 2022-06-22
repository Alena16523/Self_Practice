package day09_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = input.nextInt();

        String result=(score>=0 && score<=100)?
                (score>90)? "A":(score>=80 && score<90)? "B":(score>=70 && score<80)? "C"
                        :(score>=60 && score<70)? "D":"F"
                :"Invalid Score";

        System.out.println("Your grade is: " + result);

        input.close();

    }
}
