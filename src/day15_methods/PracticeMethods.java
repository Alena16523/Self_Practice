package day15_methods;

public class PracticeMethods {

    public static void main(String[] args) {

        System.out.println(domain("alena@gmail.com"));

        System.out.println(capitalization("alena","elhajassaad"));

        System.out.println(dayOfTheWeek(5));
    }

    public static String domain(String str){
        String result=str.substring(str.indexOf('@')+1,str.indexOf('.'));
        return result;
    }

    public static String capitalization(String name, String lastName){

        String name1=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        String lastName1=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        return name1+" "+lastName1;
    }

    public static String dayOfTheWeek (int num){

        String result="";

        if (num>=1 && num<=7){
            switch(num){
                case 1: result="Monday";
                break;
                case 2: result="Tuesday";
                break;
                case 3: result="Wednesday";
                break;
                case 4: result="Thursday";
                break;
                case 5: result="Friday";
                break;
                case 6: result="Saturday";
                break;
                default: result="Sunday";
            }
        }else{
            System.out.println("invalid Number");
        }
             return result;
    }






}
