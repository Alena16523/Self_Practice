package day22_ArrayList;

import java.util.Arrays;

public class ReplcaeArrayMethod2 {

    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};

        arr=replaceAll(arr,30, 300);

        System.out.println(Arrays.toString(arr));

    }
    public static int[] replaceAll(int[] array, int oldElement, int newElement){


        for (int i = 0; i < array.length; i++) {

            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }


}
