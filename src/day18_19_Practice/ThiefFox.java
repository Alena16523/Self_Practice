package day18_19_Practice;

public class ThiefFox {

    public static void main(String[] args) {

        Fox fox1=new Fox();
        fox1.setInfo(true, true, "black", 0);

        Fox fox2=new Fox();
        fox2.setInfo(true, true, "black", 2);

        Fox fox3=new Fox();
        fox3.setInfo(true, true, "black", 3);

        Fox fox4=new Fox();
        fox4.setInfo(false, true, "grey", 3);

        if (fox1.isWearCoat && fox1.hasTorch && fox1.coatCover.equals("black") && fox1.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox1 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox1 cleared of charges!");
        }

        if (fox2.isWearCoat && fox2.hasTorch && fox2.coatCover.equals("black") && fox2.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox2 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox2 cleared of charges!");
        }

        if (fox3.isWearCoat && fox3.hasTorch && fox3.coatCover.equals("black") && fox3.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox3 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox3 cleared of charges!");
        }

        if (fox4.isWearCoat && fox4.hasTorch && fox4.coatCover.equals("black") && fox4.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox4 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox4 cleared of charges!");
        }



    }
}
