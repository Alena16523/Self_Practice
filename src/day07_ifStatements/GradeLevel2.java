package day07_ifStatements;

import java.sql.PreparedStatement;

public class GradeLevel2 {

    public static void main(String[] args) {

        byte gradeLevel = 4;

        String schoolType="";

        if(gradeLevel>1 && gradeLevel<18){
            if(gradeLevel>=1 && gradeLevel<=5){
                schoolType="Elementary School";
            }else if(gradeLevel>=6 && gradeLevel<=8){
                schoolType="Middle School";
            }else if(gradeLevel>=9 && gradeLevel<=12){
                schoolType="High School";
            }else if(gradeLevel>=13 && gradeLevel<=16){
                schoolType="College";
            }else{
                schoolType="Grad School";
            }
        }else{
            schoolType="Invalid grade level given";
        }

        System.out.println(schoolType);





    }

}
