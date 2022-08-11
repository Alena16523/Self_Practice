package day32_Interface;

public class CamelCase {
    public static void main(String[] args) {

        String word ="camelCasing";

        System.out.println(brokenCase(word));

    }


    public static String brokenCase(String word){

        String word2="";

        for(int i=0; i<word.length(); i++){
            char each=word.charAt(i);

            if(Character.isUpperCase(each)){
                word2+=" "+each;
            }else{
                word2+=each;
            }

        }

        return word2;
    }


}
