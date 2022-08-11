package day25_customClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country;
    public String title;
    public String genre;
    public String director;
    public ArrayList<String> casts;
    public LocalDate releasedDate;

    public Movie(String country, String title, String director, LocalDate releasedDate) {
        this.country = country;
        this.title = title;
        this.director = director;
        this.releasedDate = releasedDate;
    }

    public void addCast(String str){
        casts.add(str);
    }

    public void addCasts(String[] str){
        casts.addAll(Arrays.asList(str));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releasedDate=" + releasedDate +
                ", total number of casts=" + casts.size() +
                '}';
    }
}
/*
1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

 */