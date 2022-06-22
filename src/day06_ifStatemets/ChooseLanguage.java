package day06_ifStatemets;

public class ChooseLanguage {

    public static void main(String[] args) {

        int selection= 1;

        String language ="";

        if(selection==1){
            language= "Hello, thanks for your call";
        }

        if(selection==2){
            language= "Hola, gracias para llamar";
        }

        if(selection==3){
            language= "Merhaba, aradiginiz icin tesekkurler";
        }

        if(selection==4){
            language= "Privet, spasibo za vash zvonok";
        }

        if(selection==5){
            language= "Merci, pour votre appel";
        }

        System.out.println(language);



    }


}
