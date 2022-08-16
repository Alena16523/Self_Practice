package day43_generics;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<Double> list=new ArrayList<>();
        list.add(2.5);
        list.add(4.7);
        list.add(5.4);

        print(list);

    }

    public static void print(List<? extends Number> list){
        for (Number n : list) {
            System.out.print(n+" ");
            System.out.println();
        }
    }

}
