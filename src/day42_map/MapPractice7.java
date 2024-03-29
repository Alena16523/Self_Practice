package day42_map;

import java.util.*;

public class MapPractice7 {
    public static void main(String[] args) {

        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 4.0);
        unit1.put("Escape Sequences", 2.0);
        unit1.put("Primitives", 4.0);
        unit1.put("Operators", 6.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Methods", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance", 13.5);
        unit5.put("Final keyword", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 9.5);
        unit6.put("OOP Polymorphism", 7.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);

        List<Map<String, Double>> units = new ArrayList<>();
        units.addAll(Arrays.asList(unit1, unit2, unit3, unit4, unit5, unit6));

        for (Map each : units) {
            for (Object elements : each.entrySet()) {
                System.out.println(elements);
            }
        }

        System.out.println("-------------------------");

        for (Map<String, Double> each : units) {
            for (Map.Entry<String, Double> eachEntry : each.entrySet()) {
                if (eachEntry.getValue() > 7) {
                    System.out.println("We spent more than 7 hours on : " + eachEntry.getKey());
                }
            }
        }

        System.out.println("------------------------");

        for (Map<String, Double> each : units) {
            for (Map.Entry<String, Double> eachEntry : each.entrySet()) {
                if (eachEntry.getValue() < 3) {
                    System.out.println("We spent less than 3 hours on: " + eachEntry.getKey());
                }
            }
        }

        System.out.println("-------------------------");

        ArrayList<Double> values = new ArrayList();

        for (Map<String, Double> eachMap : units) {
            values.add(Collections.max(eachMap.values()));
            values.add(Collections.min(eachMap.values()));
        }

        double max = Collections.max(values);
        double min = Collections.min(values);

        for (Map<String, Double> eachMap : units) {

            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {

                if (eachEntry.getValue() == max) {
                    System.out.println(eachEntry.getKey() + " : topic we spent most hours on");
                }

                if (eachEntry.getValue() == min) {
                    System.out.println(eachEntry.getKey() + " : topic we spent least hours on");
                }
            }
        }
    }
}
/*

        5.1 Create a List and store all the map objects given in above

        5.2 Display each Java topic and its hours on the console

        5.3 Display the names of the java topics that we spend more than 7 hours

        5.4 Display the names of the java topics that we spend less than 3 hours

        5.5 Which Java Topic has the maximum hours?

        5.6 Which topic has the minimum hours?

 */