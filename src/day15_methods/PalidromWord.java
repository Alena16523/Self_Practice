package day15_methods;

public class PalidromWord {

    public static void main(String[] args) {

        String given="Anna";

        String reverse="";

        for (int i = given.length()-1; i >= 0; i--) {

            reverse+=given.charAt(i);
        }

        boolean isPalindrome=given.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);

    }

}
