package day16_loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=input.nextLine();

        System.out.println("Enter your gender: F/M");
        char gender=input.next().charAt(0);

        while(!(gender=='F'||gender=='M')){
            System.out.println("Invalid, please re-enter your gender: F/M");
            gender=input.next().charAt(0);
        }

        System.out.println("Are you married? Yes/No");
        String married=input.next().toLowerCase();

        while(!(married.equals("yes")||married.equals("no"))){
            System.out.println("Invalid, please re-enter. Are you married? yes/no");
            married=input.next();
        }

        System.out.println("Enter your age: ");
        int age=input.nextInt();

        while(!(age>0 && age<120)){
            System.out.println("Invalid age, please re-enter your age: ");
            age=input.nextInt();
        }

        System.out.println("Enter how many miles you drive in a day?");
        int miles=input.nextInt();

        while(!(miles>=5)){
            System.out.println("Invalid, please re-enter miles/per day: ");
            miles=input.nextInt();
        }

        System.out.println("Do you have any accidents or claims in the last 5 years? yes/no");
        String accident=input.next().toLowerCase();

        while(!(accident.equals("yes") || accident.equals("no"))){
            System.out.println("Invalid entry, please re-enter : yes/no");
            accident=input.next();
        }

        System.out.println("Do you have anti-theft device in your car? yes/no");
        String antiTheft=input.next().toLowerCase();

        while(!(antiTheft.equals("yes")|| antiTheft.equals("no"))){
            System.out.println("Invalid entry, please re-enter: yes/no");
            antiTheft=input.next();
        }

        input.nextLine(); //to enter key

        System.out.println("Do you want: full coverage/liability insurance? yes/no");
        String cover=input.nextLine();

        int totalFullCov=0;
        int totalLiability=0;

        if(cover.equalsIgnoreCase("yes")){
            System.out.println("For full coverage: f; for liability insurance: l");
            String coverage=input.next();

            switch(coverage){
                case "f":
               if(age<25){
                   totalFullCov+=160;
               }else{
                   totalFullCov+=120;
               }

               if(miles>=10){
                   totalFullCov+=20;
               }else if(miles>10&&miles<=50){
                   totalFullCov+=40;
               }else{
                   totalFullCov+=70;
               }


               break;
                case "l":
                    if(age<25){
                        totalLiability+=90;
                    }else{
                        totalLiability+=50;
                    }

                    if(miles<=10){
                        totalLiability+=10;
                    }else if(miles>10&&miles<=50){
                        totalLiability+=30;
                    }else{
                        totalLiability+=50;
                    }

                    break;
                }

            }

        if (antiTheft.equalsIgnoreCase("yes")) {
            totalFullCov-= totalFullCov*0.5;totalLiability-=totalLiability*0.5;
        }else if(accident.equalsIgnoreCase("yes")){
            totalFullCov+=totalFullCov*0.15; totalLiability+=totalLiability*0.15;
        }else if(accident.equalsIgnoreCase("no")){
            totalFullCov-=totalFullCov*0.10; totalLiability-=totalLiability*0.10;
        }else if(married.equalsIgnoreCase("yes")){
            totalFullCov-=totalFullCov*0.05; totalLiability-=totalLiability*0.05;
        }else{
            totalFullCov+=0;
        }

        System.out.println("totalLiability = $" + totalLiability);
        System.out.println("totalFullCov = $" + totalFullCov);


    }
    }




/*
Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?

				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount
 */