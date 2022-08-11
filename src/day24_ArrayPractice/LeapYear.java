package day24_ArrayPractice;

import java.time.LocalDate;

public class LeapYear {

    public static void main(String[] args) {
          int year=2000;

        System.out.println(isLeap(year));


    }

    public static boolean isLeap(int year){
        LocalDate of = LocalDate.of(year, 6, 6);
        return of.isLeapYear();

    }

}
/*
Create a function that accepts an int argument birthYear,
return true if the person was born on leap year, otherwise return false
 */