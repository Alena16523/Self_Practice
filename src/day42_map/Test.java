package day42_map;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] array={3,5,-4,8,11,1,-1,6};

        int targetSum=-5;

        System.out.println(Arrays.toString(twoNumberSum(array, targetSum)));


    }

    public  static int[] twoNumberSum(int[] array, int targetSum){

        int[] newArray=new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if(array[i]+array[k]==targetSum){
                    newArray[0]=array[i];
                    newArray[1]=array[k];
                }
            }
        }

        return newArray;
    }




}
