package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String[][] batch1Groups = {batch1Group1, batch1Group2, batch1Group3};


        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch2Groups = {batch2Group1, batch2Group2, batch2Group3};

        String[][][] cydeoStudents = {batch1Groups, batch2Groups};

        for (String[][] cydeoStudent : cydeoStudents) {
            for (String[] studentsGroup : cydeoStudent) {
                for (String students : studentsGroup) {
                    System.out.println(students);


                }

            }
        }
    }
}
/*
3. given the following arrays:
				String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups

		5. declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of CydeoStudents

		6. Print the names of each students

 */