package day32_Interface.mentorSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CombineAll {
    public static void main(String[] args) {
        ArrayList<Integer> numbersOne = new ArrayList<>();
        numbersOne.addAll(Arrays.asList(1,7,5,9));

        ArrayList<Integer> numbersTwo = new ArrayList<>();
        numbersTwo.addAll(Arrays.asList(5,0,5,6));

        System.out.println(combineAL(numbersOne, numbersTwo));
    }

    public static ArrayList<Integer> combineAL(ArrayList<Integer> numbersOne, ArrayList<Integer> numberTwo){

        ArrayList<Integer> combined=new ArrayList<>();

        for (Integer each : numbersOne) {
            combined.add(each);
        }

        for (Integer each : numberTwo) {
            combined.add(each);
        }

        Collections.sort(combined);

        return combined;
    }
}

