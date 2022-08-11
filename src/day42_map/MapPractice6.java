package day42_map;

import java.util.Hashtable;
import java.util.Map;

public class MapPractice6 {
    public static void main(String[] args) {
        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        Map<String, Object> car4 = new Hashtable<>();
        car4.put("brand", "Tesla");
        car4.put("model", "Model X");
        car4.put("color", "Black");
        car4.put("year", 2020);
        car4.put("price", 65000);
        car4.put("electric", true);

        Map<String, Object> car5 = new Hashtable<>();
        car5.put("brand", "Acura");
        car5.put("model", "RDX");
        car5.put("color", "White");
        car5.put("year", 2014);
        car5.put("price", 15000);
        car5.put("electric", false);

        Map<String, Object> car6 = new Hashtable<>();
        car6.put("brand", "BMW");
        car6.put("model", "X6");
        car6.put("color", "White");
        car6.put("year", 2022);
        car6.put("price", 80000);
        car6.put("electric", false);

        Map<Integer, Map<String, Object>> myCars=new Hashtable<>();
        myCars.put(1, car1);
        myCars.put(2, car2);
        myCars.put(3, car3);
        myCars.put(4, car4);
        myCars.put(5, car5);
        myCars.put(6, car6);

        Integer max=Integer.MIN_VALUE;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Brand: "+ myCars.get(i).get("brand")+" model: "+myCars.get(i).get("model")+" Price: $"+ myCars.get(i).get("price"));

            if(myCars.get(i).get("electric").equals(true)){
                System.out.println(myCars.get(i));
            }
            if((Integer)myCars.get(i).get("price")>max){
                max=(Integer) myCars.get(i).get("price");
            }
        }
        System.out.println("-----------------------------");

        for (int i = 1; i <= 6; i++) {

            if((Integer)myCars.get(i).get("price")==max){
                System.out.println("The most expensive car is: "+ myCars.get(i));
            }
        }

    }
}
/*
        (Create 3 more map objects and store 3 different car informations in them)

        4.1 Create a map named myCars that takes car number as a key and car info as a value
        		Hint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value

		4.2 Display the brand-model-price of each car

		4.3 Dispay all the electric cars

		4.4 Display the most expensive car


 */