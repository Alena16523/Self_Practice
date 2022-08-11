package day24_ArrayPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTask {

    public static void main(String[] args) {

        ArrayList<String> country=new ArrayList<>();
        country.addAll(Arrays.asList("Africa", "Great Britain", "usa"));

        country.removeIf(each->each.length()>=10);

        System.out.println(country);

    }
}
/*
Create an ArrayList of string called country names, write a program that can remove
all the country names that have length of 10 or greater


 */