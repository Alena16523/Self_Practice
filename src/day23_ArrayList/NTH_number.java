package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NTH_number {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int nth=5;
        //finding 5th largest number

        if (nth != 1){
            for (int i = 0; i < nth - 1; i++) {
                list.removeAll(Arrays.asList(Collections.max(list)));
            }
        }
        System.out.println(Collections.max(list));


    }
}
/*
write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */