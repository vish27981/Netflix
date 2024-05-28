package example.com.netflix.model;

import java.util.List;


public class MovieDetailModel {
    private final MovieModel movie;
    private final List<MovieModel> moviesSimiler;

    public MovieDetailModel(MovieModel movie, List<MovieModel> moviesSimiler) {
        this.movie = movie;
        this.moviesSimiler = moviesSimiler;
    }

    public MovieModel getMovie() {
        return movie;
    }

    public List<MovieModel> getMoviesSimiler() {
        return moviesSimiler;
    }
}
