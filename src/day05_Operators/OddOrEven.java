package day05_Operators;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 20;

        boolean evenNumber = number%2==0;
        boolean oddNumber = number%2!=0;

        System.out.println(number + " is an even number: "+ evenNumber);
        System.out.println(number + " is an odd number: "+ oddNumber);

    }

}
