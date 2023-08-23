package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant  {
    private String name;
    private int stars;
    private int price;
    private List<Review> reviews;


    public Restaurant(String name,int stars, int price) {
        this.name=name;
        this.stars=Math.max(0, Math.min(5, stars));
        this.price=price;
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
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

    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                '}';
    }
}
