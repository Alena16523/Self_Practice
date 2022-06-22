package day22_ArrayList;

import java.util.Arrays;

public class SwapArayPractice {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        arr=swap(arr, 2, 4);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] swap(int[]arr, int i, int j){
        int temp; //extra variable as a bucket to hold the element
        for (int k = 0; k < arr.length; k++) {
            if(k == i){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

}
/*
Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

 */