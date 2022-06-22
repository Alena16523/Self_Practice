package day12_custom_method;

public class LeapYear {

    public static void main(String[] args) {

        int year=2000;


        if(year%4==0){
            if(year%4==0 && year%100!=0){
                System.out.println("It is not a leap year");
            }else{
                System.out.println("It is a leap year");
            }

        }else{
            System.out.println("It is not a leap year");
        }
    }
}
