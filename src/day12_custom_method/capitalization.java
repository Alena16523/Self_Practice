package day12_custom_method;

import java.sql.SQLOutput;

public class capitalization {

    public static void main(String[] args) {
       capitalization("cyDeo", "sCHooL");

    }

    public static void capitalization(String firstName, String lastName){
        firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(firstName+" "+lastName);

    }
}
