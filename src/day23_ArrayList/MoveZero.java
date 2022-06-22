package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZero {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));


        Collections.sort(list); //[0, 0, 0, 0, 1, 2, 3, 4]
        Collections.reverse(list);
        System.out.println(list);

    }
}
/*
Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */