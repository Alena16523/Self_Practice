package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertArrayPractice {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        arr=insert(arr, 2, 100);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] insert(int[] array, int index, int element){
        int[] newArray=Arrays.copyOf(array,array.length+1); //new array with length +1
        int[] r3 = Arrays.copyOfRange(array, index, array.length); //third new array, starting from int index given
        newArray[index]=element;// assigning given index=given element
        for(int i = 0, j = index; i<r3.length;i++,j++) {//iterating and adding 2 arrays together
            newArray[j + 1] = r3[i];
        }

        return newArray;
    }



}
/*
Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}

 */