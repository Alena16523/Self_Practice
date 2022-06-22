package day04_Castings_Concantenation;

public class SalaryCalculator2 {

    public static void main(String[] args) {

        int hourlyRate = 50,
                weeklyHours = 45,
                stateTaxRate = 6,
                federalTaxRate =26,
                salaryBeforeTax = (weeklyHours*hourlyRate)*52;

        double  federalTax = (salaryBeforeTax*federalTaxRate)/100,
                stateTax = (salaryBeforeTax*stateTaxRate)/100,
                totalTax = stateTax +federalTax,
                salaryAfterTax = salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: $"+salaryBeforeTax
                +"\nFederal tax is: $"+federalTax
                +"\nState tax is: $"+stateTax
                +"\nTotal tax is: $"+totalTax
                +"\nNet income is: $"+salaryAfterTax);







    }

}
