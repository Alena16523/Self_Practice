package day06_ifStatemets;

public class OxygenTank {

    public static void main(String[] args) {

        int level =50;

        String tankLevel = "";

        if(level>=50){
            tankLevel="Be careful now you at 50%";
        }

        if(level>=60){
            tankLevel="Start to head back";
        }

        if(level>=70){
            tankLevel="Dont go too far";
        }

        if(level>=80){
            tankLevel="Still ok";
        }

        if(level>=90){
            tankLevel="Your tank is full";
        }

        System.out.println(tankLevel);






    }

}
