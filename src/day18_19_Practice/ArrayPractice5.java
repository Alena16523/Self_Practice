package day18_19_Practice;

public class ArrayPractice5 {

    public static void main(String[] args) {

        int[] num1={1,2,3,4,5};
        int[] num2={4,5,6,7,8};

        String result="";

        for (int i = 0; i < num1.length; i++) {
            for (int i1 = 0; i1 < num2.length; i1++) {
                if(num1[i]==num2[i1]){
                    result+=num1[i]+" ";
                }
            }
        }

        System.out.println(result);









        /*Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

         */
    }
}
