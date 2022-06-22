package day07_ifStatements;

public class CrewAndPassanger {

    public static void main(String[] args) {

        int onTheShip = 50;

        String result = "";

        if(onTheShip==50 || onTheShip==75 || onTheShip==100){
                if(onTheShip==50){
                    result="20 crew,30 passangers";
                }else if(onTheShip==75){
                    result="25 crew, 50 passangers";
                }else{
                    result="30 crew, 70 passangers";
                }
        }else{
            result="invalid number of people";
        }

        System.out.println(result);





    }

}

/*
Create a class called CrewAndPassanger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
