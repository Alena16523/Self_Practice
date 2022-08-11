package day24_ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;

public class RemoveDates {
    public static void main(String[] args) {

        ArrayList<LocalDate> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                LocalDate.of(2020, 5, 30)
        ));

        list.removeIf(p -> p.isBefore(LocalDate.of(2016, 8, 15)));

        System.out.println(list);

    }


}
/*
create an Arraylist of LocalDate,
write a program that can remove all the dates before August-15-2016
 */