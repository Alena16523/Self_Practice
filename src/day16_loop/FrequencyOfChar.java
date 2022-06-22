package day16_loop;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter string and a character:");
        String str=input.nextLine();
        char ch=input.next().charAt(0);

        int times=0;

        for (int i = 0; i < str.length(); i++) {

                if(str.charAt(i)==ch){
                    times+=1;
                }

        }
        System.out.println(times);
    }


}
