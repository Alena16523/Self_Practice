package day42_map;

import java.util.*;

public class MapPractice5 {
    public static void main(String[] args) {

        List<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));

        List<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));

        List<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));

        List<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));

        List<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));

        Map<Integer, List<String>> students=new LinkedHashMap<>();
        students.put(1, group1);
        students.put(2, group2);
        students.put(9, group9);
        students.put(24, group24);
        students.put(5, group5);

        for (Map.Entry<Integer, List<String>> eachEntry : students.entrySet()) {
            for (String eachStudent : eachEntry.getValue()) {
                System.out.print(eachStudent+" ");
            }
            System.out.println("");
        }

    }
}
/*

        3.1 Create map that has interger as keys and List of Strings as values.
        	add the group number and students name of that group as a pair to the map

    	3.2 Write a program that can display student names of the each group in 5 seperate lines


 */