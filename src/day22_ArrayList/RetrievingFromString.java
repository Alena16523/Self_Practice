package day22_ArrayList;

public class RetrievingFromString {
    public static void main(String[] args) {

        String str = "Wooden Spoon!";

        String letters = "";
        String digits = "";
        String specialChars = "";

        char[] arr = str.toCharArray();  //to convert a string to array

        for (int i = 0; i < arr.length; i++) {
            if(Character.isLetter(arr[i])){
                letters += arr[i];
            } else if(Character.isDigit(arr[i])){
                digits += arr[i];
            } else {
                specialChars += arr[i];
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }


    }

/*
Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods

 */