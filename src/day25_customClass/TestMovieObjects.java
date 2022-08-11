package day25_customClass;

import java.time.LocalDate;

public class TestMovieObjects {
    public static void main(String[] args) {

        String[] casts = {"Ozzy", "Ali", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        Movie object1=new Movie("USA", "Java Developer: Zero to Hero", "Kuzzat Altay",
                LocalDate.of(2021,04, 18));

        object1.addCasts(casts);

        System.out.println(object1);






    }
}
