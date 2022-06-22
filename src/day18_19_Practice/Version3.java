package day18_19_Practice;

public class Version3 {

    public static void main(String[] args) {

        Fox fox1=new Fox();
        fox1.setInfo(true, true, "black", 0);

        Fox fox2=new Fox();
        fox2.setInfo(true, true, "black", 2);

        Fox fox3=new Fox();
        fox3.setInfo(true, true, "black", 3);

        Fox fox4=new Fox();
        fox4.setInfo(false, true, "grey", 3);

        for (int i = 1; i <=4 ; i++) {
            switch(i){
                case 1:
                    printSuspectStatus(isSuspect(fox1),i);
                    break;
                case 2:
                    printSuspectStatus(isSuspect(fox2),i);
                    break;
                case 3:
                    printSuspectStatus(isSuspect(fox3),i);
                    break;
                case 4:
                    printSuspectStatus(isSuspect(fox4),i);
                    break;
            }
        }


    }

    public static void printSuspectStatus(boolean isSuspect, int foxNumber){
        if(isSuspect){
            System.out.println("\uD83E\uDD8A Fox"+foxNumber+" is one of suspects! \uD83E\uDD14");
        }else{
            System.out.println("\uD83E\uDD8A Fox"+foxNumber+" cleared of charges!");
        }
    }

    public static boolean isSuspect(Fox fox){
        return fox.isWearCoat && fox.hasTorch && fox.coatCover.equals("black") && fox.bagCount == 3;
    }




}

