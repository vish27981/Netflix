package example.com.netflix.model;

import java.util.List;


public class CategoryModel {
    private String name;
    private List<MovieModel> movies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MovieModel> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieModel> movies) {
        this.movies = movies;
    }
}
