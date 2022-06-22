package day09_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius=input.nextDouble();

        double area= 3.14*(radius*radius);
        double perimeter = 2*3.14*radius;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        input.close();
    }

}
