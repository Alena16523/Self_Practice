package day42_map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        int maximum = Collections.max(map.values());
        int minimum = Collections.min(map.values());

        for (Map.Entry<String, Integer> key : map.entrySet()) {
            if (key.getValue().equals(maximum)) {
                System.out.println(key.getKey() + " makes maximum salary.");
            }
            if (key.getValue().equals(minimum)) {
                System.out.println(key.getKey() + " makes minimum salary.");
            }
        }

        System.out.println("-------------------------------");

        int count=0;

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if(eachEntry.getValue()>=120000 && eachEntry.getValue()<=150000){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("----------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if(eachEntry.getValue()<118000){
                System.out.println(eachEntry.getKey()+" is making less than 118k");
            }
        }

        System.out.println("---------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if(eachEntry.getValue()<120000){
                map.replace(eachEntry.getKey(), eachEntry.getValue()+10000);
            }
        }

        System.out.println(map);




    }
}
/*
    2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
 */