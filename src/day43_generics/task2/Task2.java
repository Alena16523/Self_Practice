package day43_generics.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2{

    public static void main(String[] args) {

        List<Integer> ci= Arrays.asList(1,2,3,4,5);
        int count=countIf(ci, new OddPredicate());
        int count2=countIf(ci, new EvenPredicate());
        List<String> names=new ArrayList<>(Arrays.asList("Spoon", "Apple", "Car"));
        int count3=countIf(names, new BiggerThan3Predicate());


        System.out.println("Number of odd integers = "+count);
        System.out.println("Number of even integers = "+count2);
        System.out.println("Number of words longer than 3 letters = "+count3);


    }

    private static <T> int countIf(List<T> ci, UnaryPredicate <T> unaryPredicate) {
        int count=0;
        for (T each : ci) {
            if(unaryPredicate.test(each)){
                count++;
            }
        }
        return count;
    }
}
