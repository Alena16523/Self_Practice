package day08_Ternaries_Switch;

public class Milisecond {

    public static void main(String[] args) {

        long milliSecond =366000;

        int seconds = (int)milliSecond/1000;
        int sec = seconds%60;
        int min = sec%60;
        int hour = min%60;

        System.out.println("sec = " + sec);
        System.out.println("min = " + min);
        System.out.println("hour = " + hour);



    }

}
