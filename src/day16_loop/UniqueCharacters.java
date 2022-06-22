package day16_loop;

import javax.print.attribute.standard.PresentationDirection;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str="AABCCD";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            boolean same=str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i));//if index match, then unique

            if(same){
                result+=str.charAt(i);
            }

        }
        System.out.println(result);

    }
}
/*
9. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique

 */