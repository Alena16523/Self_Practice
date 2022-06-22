package day08_Ternaries_Switch;

public class NumberToWord {

    public static void main(String[] args) {

        int n =8;

        String result=(n>=0 && n<=9)?
                        (n==0)? "zero":(n==1)? "one":(n==2)? "two":(n==3)? "tree":(n==4)?
                        "four":(n==5)? "five":(n==6)? "six":(n==7)? "seven":(n==8)?
                        "eight":"nine"
                      :"invalid";

        System.out.println(result);

    }

}
/*
Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary

 */