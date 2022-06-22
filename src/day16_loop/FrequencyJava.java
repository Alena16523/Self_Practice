package day16_loop;

import java.util.Scanner;

public class FrequencyJava {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str=input.nextLine().toLowerCase();

        System.out.println(java(str));


    }

    public static int java(String str){

        int num=0;

        for (int i = 0; i < str.length()-4; i++) {

            if(str.substring(i,i+3).contains("java")){
                num+=1;
            }

        }
        return num;
    }


}
