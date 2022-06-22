package day16_loop;

import java.util.Scanner;

public class logInFunction {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String userFirst="Cydeo";
        String passFirst="Cydeo123";

        for (int i = 3; i >0;) {
            System.out.println("Enter your username: ");
            String userName = input.next();

            System.out.println("Enter your password: ");
            String password=input.next();

            boolean isValid = userFirst.equals(userName) && passFirst.equals(password);

            if(isValid){
                System.out.println("Logged in");
                break;
            }else if(!isValid){
               if(i!=1){
                   System.out.println("Invalid credentials. "+(i-1)+" attempts left");
                   i--;
               }else{
                   System.out.println("Your account is locked.");
                   break;
               }

            }

        }


        input.close();

    }

}
