package day22_ArrayList;

import java.util.Arrays;

public class ReplaceArrayMethod {

    public static void main(String[] args) {

       int[] arr = {1,2,3,4,5}; //replace index2 =30

        arr=replace(arr, 2, 30 );
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------");

        double[] arr1={1.5, 2.5, 3.5, 4.5, 7.5};

        arr1=replace(arr1,4, 5.5);
        System.out.println(Arrays.toString(arr1));

        System.out.println("-------------------------");

        char[] chart={'a', 'b', 'c', 'd'};
        chart=replace(chart, 1, 'e');
        System.out.println(Arrays.toString(chart));

        System.out.println("-------------------------");

        String[] names={"Taha", "Yassin", "Bassel"};
        names=replace(names,2,"Alena");
        System.out.println(Arrays.toString(names));

    }

    public static int[] replace(int[] array, int index, int newElement){
           array[index]=newElement;
           return array;
    }

    public static double[] replace(double[] array, int index, double newElement){
        array[index]=newElement;
        return array;
    }

    public static char[] replace(char[] array, int index, char newElement){
        array[index]=newElement;
        return array;
    }

    public static String[] replace(String[] array, int index, String newElement){
        array[index]=newElement;
        return array;
    }


}
/*
1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays

 */