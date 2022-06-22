package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmad {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("John");
        names.add("Ahmad");
        names.add("Daniel");
        names.add("Ahmad");
        names.add("James");
        names.add("Muhammed");

        names.removeAll(Arrays.asList("Ahmad"));
        System.out.println(names);

    }
}
/*
Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];


 */