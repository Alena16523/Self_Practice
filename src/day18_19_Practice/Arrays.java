package day18_19_Practice;

public class Arrays {

    public static void main(String[] args) {

        String[] classMates={"Alena Amal", "Marika Hafis", "Sergey Doris", "Olesya Mari", "Olga Neptun"};

        for (String each : classMates) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.indexOf(" ")+1));
        }

        System.out.println("----------------------------------------");

        String[] reverseMates={"Alena", "Olga", "Marika"};

        for (int i = 0; i < reverseMates.length; i++) {
            String result="";
            for (int j = reverseMates[i].length()-1; j >=0 ; j--) {
                result+=reverseMates[i].charAt(j)+"";
            }
            System.out.println(result);
        }

        System.out.println("-----------------------------");

        String[] items  = {"Shoes", "Jacket","Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs ={12345, 12346, 12347,12348, 12349, 12350};

        for (int i = 0; i < items.length; i++) {
            if(items[i].equals("Gloves")){
                System.out.println("Index of Gloves: "+i);
            }
        }

        for (int i = 0; i < items.length; i++) {
            boolean contained=items[i].equals("iPad");
                if(contained){
                    System.out.println(true);
                }
            }

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+" - "+prices[i]+" - "+itemIDs[i]);
        }












        }








    }

