package mentorSession;

public class Fight {

    public String name;
    public int health;
    public int damagePerAttack;

    public void setInfo(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static String declareWin(Fight fighter1, Fight fighter2){

        String result="";

        while(fighter1.health>0 && fighter2.health>0){
            fighter2.health=fighter2.health-fighter1.damagePerAttack;

            if(fighter2.health<=0){
                result=(fighter1.name+" is a winner!");
                break;
            }

            fighter1.health=fighter1.health-fighter2.damagePerAttack;

            if(fighter1.health<=0){
                result=fighter2.name+" is a winner!";
                break;
            }
        }
        return result;
    }




}
