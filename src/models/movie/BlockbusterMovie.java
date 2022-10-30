package models.movie;

import java.util.ArrayList;

public class BlockbusterMovie extends Movie {

    public BlockbusterMovie() {
        super();
    }

    public BlockbusterMovie(String movieTitle, String movieType, MovieAgeRating movieAgeRating,
            MovieShowingStatus showingStatus, ArrayList<String> movieCast, String movieDirector, String movieSynopsis,
            double movieDuration, ArrayList<DateTime> showingTime) {
        super(movieTitle, movieType, movieAgeRating, showingStatus, movieCast, movieDirector, movieSynopsis,
                movieDuration, showingTime);
    }

}