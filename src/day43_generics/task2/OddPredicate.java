package day43_generics.task2;

public class OddPredicate implements UnaryPredicate <Integer> {


    @Override
    public boolean test(Integer obj) {

        return obj%2!=0;
    }
}
