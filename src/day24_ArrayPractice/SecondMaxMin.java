package day24_ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMin {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        ArrayList<Integer> newList=new ArrayList<>();

        for (Integer each : list) {
            if(!newList.contains(each)){
                newList.add(each);
            }
        }

        Collections.sort(newList); //to sort the array
        System.out.println(newList);

        int min=newList.get(1);
        int max=newList.get(newList.size()-2);

        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
/*
Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops

 */