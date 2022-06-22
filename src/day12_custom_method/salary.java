package day12_custom_method;

public class salary {

    public static void main(String[] args) {

        salary(45,40);

    }

    public static void salary (double hourlyRate, int weeklyHours){

        double salary=(weeklyHours*hourlyRate)*52;

        System.out.println("You make $"+hourlyRate+" per hour \nYou work "+weeklyHours+" hours" +
                " in a week \nYour gross income is $"+salary);

    }



}
