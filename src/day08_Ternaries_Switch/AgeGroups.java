package day08_Ternaries_Switch;

public class AgeGroups {

    public static void main(String[] args) {

        int age =42;

        String result =(age>=0 && age<=150)?
                (age>=0 && age<=2)? "infant":(age>=3 && age<=5)?"toddler": (age>=6 && age<=9)?
                        "kid":(age>=10 && age<=12)?"Pre-Teen": (age>=13 && age<=17)?"Teenager"
                        :(age>=18 && age<=20)? "Young Adult":(age>=21 && age<=39)?"Adult"
                        :(age>=40 && age<=49)? "Young Middle-Aged Adult":(age>=50 && age<=54)? "Middle-Aged Adult"
                        :(age>=55 &&age<=64)? "Very Young Senior Citizen":(age>=65 && age<=74)? "Young Senior Citizen"
                        :(age>=75 &&age<=84)?"Senior Citizen":"Old Senior Citizen"
                :"Invalid age";

        System.out.println(result);




    }

}
