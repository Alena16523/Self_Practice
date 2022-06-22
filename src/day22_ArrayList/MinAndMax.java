package day22_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MinAndMax {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int max=Collections.max(list);
        int min=Collections.min(list);

        System.out.println("min = " + min);
        System.out.println("max = " + max);





    }
}
/*
Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1

 */