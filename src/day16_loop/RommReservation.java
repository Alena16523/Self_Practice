package day16_loop;

import java.util.Scanner;

public class RommReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? yes/no");
        String yesNo = input.next();

        for (int i = 0; i < 5;) {

            if (yesNo.equalsIgnoreCase("yes")) {
                System.out.println("Which type of room would you like? king/queen/single");
                String roomType=input.next().toLowerCase();

                boolean validRoom=roomType.equals("king")||roomType.equals("queen")||roomType.equals("single");

                while(!(validRoom)){
                    System.out.println("Invalid room, please enter again. king/queen/single ");
                    roomType = input.next().toLowerCase();

                    switch(roomType){
                        case "king":
                            System.out.println("You selected king size bed: $120");
                            break;
                        case "queen":
                            System.out.println("You selected queen size bed: $100");
                            break;
                        case "single":
                            System.out.println("You selected single size bed: $80");
                            break;
                    }

                }
                break;
            } else if (yesNo.equalsIgnoreCase("no")) {
                System.out.println("Have a nice day.");
                break;
            } else {

                while (!(yesNo.equalsIgnoreCase("yes") && !(yesNo.equalsIgnoreCase("no")))) {
                    System.out.println("Invalid, please re-enter yes/no.");
                    yesNo = input.next();
                }
            }

        }
    }
}
/*
8. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */