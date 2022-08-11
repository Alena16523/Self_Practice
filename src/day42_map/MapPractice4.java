package day42_map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice4 {
    public static void main(String[] args) {

        String[] group1 = new String[4];
        group1[0]="Alena";
        group1[1]="Tatiana";
        group1[2]="Sergei";
        group1[3]="Hamza";

        String[] group2 = new String[4];
        group2[0]="Vasyl";
        group2[1]="Diana";
        group2[2]="Nora";
        group2[3]="Abidullah";

        String[] group3 = new String[3];
        group3[0]="Oleg";
        group3[1]="Kashiyar";
        group3[2]="Ali";

        String[] group4 = new String[3];
        group4[0]="Olya";
        group4[1]="Anisa";
        group4[2]="Yassin";

        String[] group5 = new String[3];
        group5[0]="Boris";
        group5[1]="Adam";
        group5[2]="Alya";

        Map<Integer, String[]> groups = new LinkedHashMap<>();
        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);
        groups.put(5,group5);

        for (Map.Entry<Integer, String[]> eachEntry : groups.entrySet()) {
            if(eachEntry.getKey()==1){
                for (String eachStudent : eachEntry.getValue()) {
                    System.out.println(eachStudent+" group ID: "+eachEntry.getKey());
                }
            }
        }

        System.out.println("-----------------------------");

        for (Map.Entry<Integer, String[]> eachEntry : groups.entrySet()) {
            for (String eachStudent : eachEntry.getValue()) {
                System.out.println(eachStudent+" group ID: "+eachEntry.getKey());
            }
        }


    }
}
/*

	    4.1 Create a map that contains group id and names of group members

	            Map<Integer, String[]> groups = new LinkedHashMap();

	        add all the group 1d and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups

 */