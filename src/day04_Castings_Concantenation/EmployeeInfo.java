package day04_Castings_Concantenation;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "Daniel",
                gender = "Male",
                companyName = "Google Inc",
                jobTitle = "Software Developer";

        int age = 28,
                salary = 90000;

        System.out.println("given data:");
        System.out.println("\tname = " + name);
        System.out.println("\tage = " + age);
        System.out.println("\tgender = " + gender);
        System.out.println("\tcompanyName = " + companyName);
        System.out.println("\tjobTitle = " + jobTitle);
        System.out.println("\tsalary = " + salary);

        System.out.println("output:\n\t"+name+ " is "+age +" years old, gender is "+
                gender+".  \n\t"+name+" works at "+companyName+" as a "+jobTitle+". \n\t"+
                name+" makes $"+salary+" per year.");

    }

}
