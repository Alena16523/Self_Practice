package day08_Ternaries_Switch;

public class CrewAndPassangers1 {

    public static void main(String[] args) {

        int onTheShip=50;
        String p ="passengers";
        String c ="crew";

        String result=(onTheShip==50 || onTheShip==75 || onTheShip==100)?
                (onTheShip==50)? "20 "+c+" 30 "+p :(onTheShip==75)? "25 "+c+" 50 "+p
                        :"30 "+c+" 70 "+p
                :"Invalid NUmber";

        System.out.println(result);

        System.out.println("----------------------------------");

        String result2="";

        switch (onTheShip){
            case 50:
                result2="20 "+c+" 30 "+p;
                break;
            case 75:
                result2="25 "+c+" 50 "+p;
                break;
            case 100:
                result2="30 "+c+" 70 "+p;
                break;
            default:
                result2="Invalid number";
        }

        System.out.println(result2);


    }

}
