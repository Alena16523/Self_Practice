package day16_loop;

import java.util.Locale;
import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Will you marry me? yes/no");
        String answer=input.next().toLowerCase();


                while(!(answer.equals("yes")||answer.equals("no"))) {
                    System.out.println("Invalid answer, please re-enter: yes/no");
                    answer = input.next().toLowerCase();
                }

                    if(answer.equals("yes")){
                        System.out.println("Congrats");

                    }else{
                        System.out.println("Goodbye");

                    }

            }

        }











