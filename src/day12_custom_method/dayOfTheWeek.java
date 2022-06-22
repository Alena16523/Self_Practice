package day12_custom_method;

public class dayOfTheWeek {

    public static void main(String[] args) {
        day(3);

    }

    public static void day(int num){
        if(num>=1 && num<=7){
            String day=(num==1)? "Monday" :(num==2)? "Tuesday":(num==3)? "Wednesday" :(num==4)? "Thursday"
                    :(num==5)? "Friday" :(num==6)? "Saturday":"Sunday";
            System.out.println(day);
        }else{
            System.out.println("Invalid Number");
        }
    }


    public static class leapYear {
        public static void main(String[] args) {
            int year=1996;

            if(year%4==0){
                if(year%100==0 && year%400!=0){
                    System.out.println("It is not a leap year");
                }else{
                    System.out.println("It is a leap year");
                }
            }else{
                System.out.println("It it not a leap year");
            }


        }
    }
}
/*
Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
 */