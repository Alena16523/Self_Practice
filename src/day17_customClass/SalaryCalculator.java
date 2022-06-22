package day17_customClass;

public class SalaryCalculator {

    public int hourlyRate;
    public int stateTaxRate;
    public int federalTaxRate;
    public int weeklyHours;
    public double salary=hourlyRate*weeklyHours*52;
    public double stateTax=(salary/100)*stateTaxRate;
    public double federalTax=(salary/100)*federalTaxRate;
    public double salaryAfterTax=salary-stateTax-federalTax;


    public void setInfo(int hourlyRate, int stateTaxRate, int federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary +
                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", salaryAfterTax=" + salaryAfterTax +
                '}';
    }
}





