package day08_Ternaries_Switch;

public class OxygenTank {

    public static void main(String[] args) {

        int number=70;

        String level =(number>=50 && number<=100)?
                    (number>=50 && number<60)? "Be careful now you at 50%":(number>=60 && number<70)? "Start to head back"
                        :(number>=70 && number<80)?"Dont go too far":(number>=80 && number<90)?"Still ok":"Your tank is full"
                :"Invalid number";

        System.out.println(level);

        System.out.println("--------------------------------------");

        String level2="";

        switch (number){
            case 50:
               level2="Be careful now you at 50%";
               break;
            case 60:
                level2="Start to head back";
                break;
            case 70:
                level2="Dont go too far";
                break;
            case 80:
                level2="Still ok";
                break;
            default:
                level2="Your tank is ful";
                break;
        }
        System.out.println(level2);



    }

}
/*
 Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
			Solution 2:	MUST use switch statement
 */