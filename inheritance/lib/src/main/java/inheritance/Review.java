package inheritance;

public class Review {
    private String author;
    private String body;
    private int numberOfStars;
    private String movie;
    private Restaurant restaurant;
    private Theater theater;
    private Shop shop;

    public Review(String author, String body, int stars, Restaurant restaurant) {
        this.author = author;
        this.body = body;
        this.numberOfStars = Math.max(0, Math.min(5, stars));
        this.restaurant = restaurant;
        restaurant.addReview(this);

    }

    public Review(String author, String body, int stars, Shop shop) {
        this.author = author;
        this.body = body;
        this.numberOfStars = Math.max(0, Math.min(5, stars));
        this.shop = shop;
        shop.addReview(this);
    }
    public Review(String author, String body, int stars, Theater theater) {
        this.author = author;
        this.body = body;
        this.numberOfStars = Math.max(0, Math.min(5, stars));
        this.theater = theater;
        theater.addReview(this);
    }
    public Review(String author, String body, int stars,String movie, Theater theater) {
        this.author = author;
        this.body = body;
        this.numberOfStars = Math.max(0, Math.min(5, stars));
        this.theater = theater;
        this.movie=movie;
        theater.addReview(this);
    }


    public int getNumberOfStars() {

        return numberOfStars;
    }

    @Override
    public String toString() {
        String establishmentName = restaurant != null ? restaurant.getName() :
                shop != null ? shop.getName() :
                        theater != null ? theater.getName() : "Unknown Place";

        String movieInfo = theater != null && movie != null ? " (Movie: " + movie + ")" : "";

        return "Review{" +
                "body='" + body + '\'' +
        ", author='" + author + '\'' +
        ", numberOfStars=" + numberOfStars +
                ", Place=" + establishmentName + movieInfo +
                '}';
    }

}


