package day05_Operators;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 200;

        boolean positiveNumber = number >0;
        boolean negativeNumber = number <0;
        boolean isZero = number==0;

        System.out.println(number + " is positive number: "+positiveNumber);
        System.out.println(number + " is negative number: "+negativeNumber);
        System.out.println(number+ " is zero: "+isZero);


    }

}
