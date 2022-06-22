package day15_methods;

public class Practice2Methods {

    public static void main(String[] args) {

        System.out.println(eligibleToVote(23,true));
        System.out.println(salary(45,40));
    }

    public static String eligibleToVote (int age, boolean isAmerican){

        String result="";

        if(age>0 && age<150){
            if(age>=21 && isAmerican){
                result="You are eligible to vote";
            }else{
                result="You are not eligible to vote";
            }
        }else{
            result="Invalid age";
        }
        return result;
    }


    public static String salary(double hourlyRate, int weeklyHours){

        double income= (weeklyHours*hourlyRate)*52;

        String result= "You make $"+hourlyRate+" per hour\nYou work "+weeklyHours+
                " hours in a week\nYour gross income is $"+income;

       return result;
    }






}
