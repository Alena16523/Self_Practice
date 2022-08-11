package day42_map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, int[]> scores=new LinkedHashMap<>();
        scores.put("Bassel", new int[]{60, 70, 40, 90, 90});
        scores.put("Alena", new int[]{60, 80, 40, 87, 90});
        scores.put("Anisa", new int[]{65, 70, 40, 90, 90});
        scores.put("Oleg", new int[]{60, 70, 50, 90, 90});
        scores.put("Vasyl", new int[]{60, 70, 40, 80, 90});

        for (Map.Entry<String, int[]> eachEntry : scores.entrySet()) {
            System.out.print(eachEntry.getKey()+" : ");
            for (int each : eachEntry.getValue()) {
                System.out.print(each+", ");
            }
        }

    }
}
/*
Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 paris into the map
		1.2 Write a program that can display each student name and scores
 */