package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater  {
    private String name;
    private List<String> movies;
    private List<Review> reviews;
    private int stars;
    public Theater(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addMovie(String movie)
    {
        movies.add(movie);
    }
    public void removeMovie(String movie)
    {
        movies.remove(movie);
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
            updateStars();
        }
    }

    private void updateStars() {
        int totalStars = 0;
        for (Review review : reviews) {
            totalStars += review.getNumberOfStars();
        }
        stars = totalStars / reviews.size();
    }
    public String getName() {
        return name;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies='" + movies + '\'' + "," +
                " stars='" + stars + '\'' +
              '}';
    }
}