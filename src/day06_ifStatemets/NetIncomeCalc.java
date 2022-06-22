package day06_ifStatemets;

import javax.management.remote.MBeanServerForwarder;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int beforeTaxSalary = 115000;
        boolean isMarried = true;

        if (beforeTaxSalary <= 79000 && !isMarried) {
            System.out.println(beforeTaxSalary - (beforeTaxSalary * 20 / 100));
        }

        if (beforeTaxSalary <= 79000 && isMarried) {
            System.out.println(beforeTaxSalary - (beforeTaxSalary * 15 / 100));
        }

        if (beforeTaxSalary >= 80000 && beforeTaxSalary <= 99000 && !isMarried) {
            System.out.println(beforeTaxSalary - (beforeTaxSalary * 25 / 100));
        }

        if (beforeTaxSalary >= 80000 && beforeTaxSalary <= 99000 && isMarried) {
            System.out.println(beforeTaxSalary - (beforeTaxSalary * 20 / 100));
        }

        if (beforeTaxSalary >= 100000 && beforeTaxSalary <= 129000 && !isMarried) {
            System.out.println(beforeTaxSalary - (beforeTaxSalary * 30 / 100));
        }

        if (beforeTaxSalary >= 100000 && beforeTaxSalary <= 129000 && isMarried){
            System.out.println(beforeTaxSalary - (beforeTaxSalary * 25 / 100));
        }

        if(beforeTaxSalary>=130000 && !isMarried){
        System.out.println(beforeTaxSalary - (beforeTaxSalary * 35 / 100));
        }

        if(beforeTaxSalary>=130000&&isMarried) {
        System.out.println(beforeTaxSalary - (beforeTaxSalary * 30 / 100));
        }


}

                }
