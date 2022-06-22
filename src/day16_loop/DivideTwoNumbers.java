package day16_loop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int n1=8;
        int n2=6;

        int times=0;

        while(n1>=n2){
            n1-=n2;
            times+=1;
        }

        System.out.println(times);







    }


}
