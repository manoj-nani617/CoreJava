package com.techouts.Assessment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable<Movie> {
    String movieName;
    int rating;
    Movie(int rating, String movieName){
        this.rating = rating;
        this.movieName = movieName;
    }
    @Override
    public int compareTo(Movie m) {
        return this.rating-m.rating;
    }

}
public class ComparableAndComparator {
    public static void main(String[] args) {
        List<Movie> m =  new ArrayList<>();
        m.add(new Movie(2,"RajaSaab"));
        m.add(new Movie(5,"Bahubali"));
        m.add(new Movie(0,"KGF"));
        Collections.sort(m);
       m.forEach(i -> System.out.println(i.rating));
    }
}
