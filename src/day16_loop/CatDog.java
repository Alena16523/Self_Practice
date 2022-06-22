package day16_loop;

import java.util.Scanner;

public class CatDog {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=input.nextLine().toLowerCase();

        String cat="cat";
        String dog="dog";

        int cat1=0;
        int dog1=0;

        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i,i+2).contains("dog")){
                dog1+=1;
            }else if(str.substring(i,i+2).contains("cat")){
                cat1+=1;
            }else{
                dog+=1;
            }
        }

        boolean isTrue=cat1==dog1;

        System.out.println(isTrue);

    }
}
