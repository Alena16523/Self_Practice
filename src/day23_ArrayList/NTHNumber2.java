package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NTHNumber2 {

    public static int nthLargestNumber3(ArrayList<Integer> numbers, int nth) {//[1, 1, 1, 1, 2, 2, 3, 3, 5, 5, 7, 7, 8, 8, 9, 9] , 3

        System.out.println(Collections.max(numbers));// this method returns the max value in list

        if (nth != 1) {//if the nth is 1 means return me the biggest number. So it will not loop through the list. In this case directly return 9. But the nth is 3
            for (int i = 0; i < nth - 1; i++) {//in every iteration it will remove the biggest value respectively.
                numbers.removeAll(Arrays.asList(Collections.max(numbers)));//in the first iteration it removes all 9 - in the second all 8 - we look for the third one
                //it should stop here. So the condition is nth - 1
            }
        }

        return Collections.max(numbers);
    }
}
