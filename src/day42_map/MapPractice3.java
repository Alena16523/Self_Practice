package day42_map;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));


        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            if(eachEntry.getValue().isBefore(LocalDate.of(2014, 12, 31))){
                System.out.println(eachEntry.getKey()+" was hired before 2015");
            }
        }

        System.out.println("----------------------------");

        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            if(eachEntry.getValue().isEqual(LocalDate.of(2020, 5, 15))){
                System.out.println(eachEntry.getKey()+" was hired on 5/15/2020");
            }
        }

        System.out.println("------------------------------");

        int count=0;

        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            if(eachEntry.getValue().isAfter(LocalDate.of(2014, 12, 31))){
                count++;
            }
        }
        System.out.println("Employees were hired after 2014: " + count);

        System.out.println("--------------------------------");

        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            System.out.println(eachEntry.getKey()+" : "+eachEntry.getValue());
        }





    }
}
/*
3.
        3.1 Display the names of the employee who were hired before 2015
                    Hint: You can use isBefore method of LocalDate

        3.2 Display the name of the employee who were hired on 5/15/2020
                    Hint: You can use isEqual method of LocalDate

        3.3 How many people were hired after 2014?
                    Hint: You can use isAfter method of LocalDate

        3.4 Display the name and hire date of the employee

 */