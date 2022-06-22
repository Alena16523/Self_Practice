package day17_customClass;

public class MeetingTask {

    public static void main(String[] args) {

        String str="bbddeeaffgi";

        int resultIndex=0;

        for (int i = 0; i < str.length()-1; i++) {

            char each=str.charAt(str.indexOf(i));

            if(each=='a'|| each=='e'|| each=='i'||each=='o'||each=='u'){
                if(each==str.charAt(str.lastIndexOf(i))){
                    resultIndex+=i;
                }
            }

        }
        System.out.println(resultIndex);





    }
}
/*
Question 1: Given a string, write a method to find the first non-repeating vowel(a,e, i,o,u) in it and return its index.
If it doesn't exist, return -1. Assume that all the characters of the String are lowercase.
(Do not use String class functions other than charAt())

Ex1: bbddeeaffgi
output: 6

Ex2: aaabbbeeeoouu
output: -1
 */