package day43_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {

    public static void main(String[] args) {

        Integer[] a={1,2,3,4};

        System.out.println(Arrays.toString(swap(a,0,2)));

    }

    public static <T> Object[] swap(T[] a, int b, int c){
        ArrayList<T> swap=new ArrayList<>();
        swap.addAll(Arrays.asList(a));

        Collections.swap(swap, b,c);
        return swap.toArray();
    }
}

