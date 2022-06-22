package day18_19_Practice;

public class Version2 {

    public static void main(String[] args) {

        Fox fox1=new Fox();
        fox1.setInfo(true, true, "black", 0);

        Fox fox2=new Fox();
        fox2.setInfo(true, true, "black", 2);

        Fox fox3=new Fox();
        fox3.setInfo(true, true, "black", 3);

        Fox fox4=new Fox();
        fox4.setInfo(false, true, "grey", 3);

        if (isSuspect(fox1)) {
            System.out.println("\uD83E\uDD8A Fox1 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox1 cleared of charges!");
        }

        if (isSuspect(fox2)) {
            System.out.println("\uD83E\uDD8A Fox2 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox2 cleared of charges!");
        }

        if (isSuspect(fox3)) {
            System.out.println("\uD83E\uDD8A Fox3 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox3 cleared of charges!");
        }

        if (isSuspect(fox4)) {
            System.out.println("\uD83E\uDD8A Fox4 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox4 cleared of charges!");
        }




    }



    public static boolean isSuspect(Fox fox){
        return fox.isWearCoat && fox.hasTorch && fox.coatCover.equals("black") && fox.bagCount == 3;
    }
}
