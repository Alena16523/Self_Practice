package day16_loop;

import java.util.Scanner;

public class RoomReservation2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Do you want to reserve a room?  yes/no");
        String yesNo =input.next().toLowerCase();

        for (int i = 0; i < 7;) {

            switch (yesNo) {
                case "yes":
                    System.out.println("What type of room do you want to reserve? king/queen/single");
                    String type = input.next().toLowerCase();

                    if(type.equals("king")){
                        System.out.println("You selected king size bed: $120");
                        return; // returning the value and exit
                    }else if(type.equals("queen")){
                        System.out.println("You selected queen size bed: $100");
                        return; //returning the value and exit
                    }else if(type.equals("single")){
                        System.out.println("You selected single size bed: $80");
                        return; //returning value, exit
                    }else{
                        System.out.println("Invalid room, please re-enter.");
                        continue;//goes back to the loop
                    }

                case "no":
                    System.out.println("Have a nice day.");
                    return; //return value, exits
                default:
                    while (!(yesNo.equalsIgnoreCase("yes")) && !(yesNo.equalsIgnoreCase("no"))) {
                        System.out.println("Invalid, please re-enter: yes/no");
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