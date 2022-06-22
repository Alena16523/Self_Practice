package day12_custom_method;

public class EligibleToVote {

    public static void main(String[] args) {

        eligibleToVote(23,true);

    }

    public static void eligibleToVote (int age, boolean isAmerican){
        if(age>=21 && isAmerican==true){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }



}
