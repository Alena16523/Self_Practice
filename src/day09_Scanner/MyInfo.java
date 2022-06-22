package day09_Scanner;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age =input.nextInt();

        System.out.println("Enter your gender: ");
        String gender=input.next();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName=input.nextLine();

        System.out.println("Enter your phone number: ");
        long phNum=input.nextLong();

        System.out.println("Enter your zip code: ");
        int zip = input.nextInt();

        input.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName=input.nextLine();

        System.out.println("Enter your city: ");
        String city=input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.next();

        System.out.println("Enter your building number: ");
        int building =input.nextInt();

        input.nextLine();

        System.out.println("Enter your street name: ");
        String street = input.nextLine();

        System.out.println("1. "+fullName+"\n2. "+age+"\n3. "+gender+
                "\n4. "+phNum+"\n5. address:"+"\n\t"+building+" "+street+"\n\t"+city+
                ", "+state+" "+zip+"\n6."+schoolName);

        input.close();
    }

}
