package day06_ifStatemets;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 10,
                n2 = 20;

        char mathOperator= '+';


        if(mathOperator=='+'){
            System.out.println(n1+n2);
        }

        if(mathOperator=='-'){
            System.out.println(n1-n2);
        }

        if(mathOperator=='*'){
            System.out.println(n1*n2);
        }

        if(mathOperator=='/'){
            System.out.println(n1/n2);
        }

        if(mathOperator!='+' && mathOperator!='-' && mathOperator!='*' &&
        mathOperator!='/'){
            System.out.println("invalid operator");
        }



    }


}
