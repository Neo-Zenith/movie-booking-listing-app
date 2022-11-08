package view;

import handler.*;
import model.*;
import model.enums.*;
import controller.*;

import java.util.ArrayList;

public class MovieSearchView extends MainView {
    private String movieTitle;
    private MovieGoer movieGoer;
    private String errorMessage;

    public MovieSearchView(MovieGoer movieGoer) {
        this.movieGoer = movieGoer;
        this.errorMessage = "";
    }

    public void printMenu() {
        MainView.printBoilerPlate("Search Movie");
        MainView.printMenuContent("Search for a movie (Press 1 to exit)");
    }

    public void appContent() {
        String movieTitle;

        do {
            if (MovieMenuView.exit) {
                return;
            }

            UIHandler.clearScreen();
            System.out.println(this.errorMessage);
            this.printMenu();
            movieTitle = InputHandler.stringHandler();

            if (movieTitle.equals("1")) {
                this.errorMessage = "";
                return;
            }

            ArrayList<Movie> movies = MovieManager.getAllMovieList(this.movieGoer);

            if (movies.size() != 0) {
                this.errorMessage = "";
                MovieDetailsView detailsView = new MovieDetailsView(movieTitle, movieGoer);
                detailsView.appContent();
            } else {
                this.errorMessage = "Error! The searched movie is not available!";
                continue;
            }

        } while (true);
    }
}