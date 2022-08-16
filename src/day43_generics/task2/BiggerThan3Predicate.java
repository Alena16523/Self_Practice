package day43_generics.task2;

public class BiggerThan3Predicate implements UnaryPredicate<String>{


    @Override
    public boolean test(String obj) {
        return obj.length()>3;
    }
}
