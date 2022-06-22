package day06_ifStatemets;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c=20;

        String isMedian = "";

        if (b>a && b<c) {
            isMedian = b+" is a median number";
        }

        if (a>b && a<c) {
            isMedian = a+ " is a median number";
        }

        if(c>a && c<b) {
            isMedian = c+" is a median number";
        }

        System.out.println(isMedian);





    }


}
