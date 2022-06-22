package day05_Operators;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number =65;

        boolean divisibleBy2 = number%2==0;
        boolean divisibleBy3 = number%2==0;
        boolean divisibleBy5 = number%5==0;

        System.out.println(number+" is divisible by 2: "+ divisibleBy2);
        System.out.println(number+ " is divisible by 3: "+ divisibleBy3);
        System.out.println(number+ " is divisible by 5: "+divisibleBy5);

    }

}
