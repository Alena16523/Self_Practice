package day15_methods;

public class SortCharacters {

    public static void main(String[] args) {

     String given = "mn@#123Ab";

        String digits="";
        String letters="";
        String characters ="";

        for (int i = 0; i < given.length()-1; i++) {

            char each=given.charAt(i);

            if(each>='0' && each <='9'){
                digits+=each;
            }else if((each >='A' && each<='Z') || (each>='a' && each<='z')){
                letters+=each;
            }else{
                characters+=each;
            }

        }
        System.out.println("letters: "+letters+"\ndigits: "+digits+
                "\nspecial chars: "+characters);
    }
}
/*
write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */