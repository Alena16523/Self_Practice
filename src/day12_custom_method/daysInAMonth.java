package day12_custom_method;

public class daysInAMonth {

    public static void main(String[] args) {

    daysInAMonth("June");

    }

    public static void daysInAMonth(String month){

        month=month.toLowerCase();

            switch(month){
                case "january": case "march": case "may": case "july":
                    case "August": case "october": case "december":
                    System.out.println("Has 31 days");
                    break;
                case "april": case "june": case "september": case "november":
                    System.out.println("Has 30 days");
                    break;
                case "february":
                    System.out.println("Has 28 days");
                    break;
                default:
                    System.out.println("Invalid month");
            }


    }

}
