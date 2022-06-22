package day10_stringMethods;

public class ValidWebsite {

    public static void main(String[] args) {

        String webSite = "www.cydeo.com";

        int w1 = webSite.indexOf("w"); //finding index numbers of www.
        int w2 = webSite.indexOf(".c");

        String domain = webSite.substring(w1, w2 + 1);//last index of substring add one more

        int end1 = webSite.indexOf(".co");
        String ending = webSite.substring(end1);

        if (domain.equals("www.") && ending.equals(".com") || ending.equals(".edu") ||
                ending.equals(".gov")) {
            System.out.println("This is a valid website address");
        } else {
            System.out.println("This is invalid address");
        }


    }

}
/*
1. write a program that can check if the given website is valid website or not
	            starts with: www.
	            ends with: .com, .edu, .gov


 */

