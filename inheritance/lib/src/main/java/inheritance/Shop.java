package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String description;
    private int numberOfDollarSigns;

    private int stars;
    private List<Review> reviews;
    public Shop(String name,String description,int numberOfDollarSigns) {
        this.name=name;
        this.description=description;
        this.numberOfDollarSigns=numberOfDollarSigns;
        this.reviews = new ArrayList<>();
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
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                ", stars=" + stars +
                '}';
    }
}
