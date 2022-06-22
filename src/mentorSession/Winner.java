package mentorSession;

public class Winner {
    public static void main(String[] args) {

     Fight fighter1=new Fight();
     fighter1.setInfo("Tom", 30, 3);

     Fight fighter2=new Fight();
     fighter2.setInfo("Harry", 20, 5);

        System.out.println(Fight.declareWin(fighter1, fighter2));

    }
}
