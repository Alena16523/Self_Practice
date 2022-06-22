package day08_Ternaries_Switch;

public class Loans {

    public static void main(String[] args) {

        int salary = 75000;
        int creditScore =700;

        String result = (salary>=60000 && creditScore>=650)? "Loan Approved":"Loan Denied";

        System.out.println(result);




    }

}
