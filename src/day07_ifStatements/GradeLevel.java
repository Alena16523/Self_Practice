package day07_ifStatements;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 3;
        String result ="";


        if(gradeLevel>=0 && gradeLevel<=18){
            if(gradeLevel>=1 && gradeLevel<=5){
                result="Elementary School";
            }else if(gradeLevel>=6 && gradeLevel<=8){
                result="Middle School";
            }else if(gradeLevel>=9 && gradeLevel<=12){
                result="High School";
            }else if(gradeLevel>=13 && gradeLevel<=16){
                result="College";
            }else{
                result="Grad School";
            }

        }else{
            result= "no such grade";
        }

        System.out.println(result);





    }

}
