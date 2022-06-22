package day06_ifStatemets;

public class WeekDays {

    public static void main(String[] args) {

        int number = 5;

        String weekDayIs = "";

        if(number==1){
            weekDayIs="Monday";
        }

        if(number==2){
            weekDayIs="Tuesday";
        }

        if(number==3){
            weekDayIs="Wednesday";
        }

        if(number==4){
            weekDayIs="Thursday";
        }

        if(number==5){
            weekDayIs="Friday";
        }

        if(number==6){
            weekDayIs="Saturday";
        }

        if(number==7){
            weekDayIs="Sunday";
        }

        System.out.println("weekDays = " + weekDayIs);



    }


}
