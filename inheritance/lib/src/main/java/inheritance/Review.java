package inheritance;

public class Review {
    private String author;
    private String body;
    private int numberOfStars;
    private Restaurant restaurant;

    public Review(String author, String body, int stars, Restaurant restaurant) {
        this.author = author;
        this.body = body;
        this.numberOfStars = Math.max(0, Math.min(5, stars));
        this.restaurant=restaurant;
    }
    public int getNumberOfStars() {
        return numberOfStars;
    }
    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", stars=" + numberOfStars +
                ", restaurant=" + restaurant.getName() +
                '}';
    }
}
