package day18_19_Practice;

public class ArraysPractice2 {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < grades.length; i++) {
            if(scores[i]<=100 && scores[i]>=0){
                if(scores[i]>=90){
                    grades[i]='A';
                }else if(scores[i]>=80){
                    grades[i]='B';
                }else if(scores[i]>=70){
                    grades[i]='C';
                }else if(scores[i]>=60){
                    grades[i]='D';
                }else{
                    grades[i]='F';
                }
            }
            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]);
        }


/*
given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */







    }

}
