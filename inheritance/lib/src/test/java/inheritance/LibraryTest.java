package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void testAddReviewAndUpdateStars() {
        Restaurant restaurant = new Restaurant("Delicious Eats", 4, 2);
        Review review1 = new Review("Alice", "Great food!", 5, restaurant);
        Review review2 = new Review("Bob", "Service could be better.", 3, restaurant);

        restaurant.addReview(review1);
        restaurant.addReview(review2);

        assertEquals(4, restaurant.stars);
    }

    @Test
    public void testRestaurantConstructorAndToString() {
        Restaurant restaurant = new Restaurant("Delicious Eats", 4, 2);

        assertEquals("Delicious Eats", restaurant.getName());
        assertEquals("Restaurant{" +
                "name='Delicious Eats', stars=4, price=2}", restaurant.toString());
    }

    @Test
    public void testAddRestaurantReview() {
        Restaurant restaurant = new Restaurant("Delicious Eats", 4, 2);
        Review review = new Review("Alice", "Great food!", 5, restaurant);
        restaurant.addReview(review);

        assertEquals(1, restaurant.reviews.size());
        assertEquals(review, restaurant.reviews.get(0));
    }

    @Test
    public void testShopConstructorAndToString() {
        Shop shop = new Shop("Fashion Emporium", "Trendy clothes", 3);

        assertEquals("Fashion Emporium", shop.getName());
        assertEquals("Shop{" +
                "name='Fashion Emporium', description='Trendy clothes', numberOfDollarSigns=3, stars=0}", shop.toString());
    }
    @Test
    public void testAddShopReview() {
        Shop shop = new Shop("Fashion Emporium", "Trendy clothes", 3);
        Review review = new Review("Alice", "Great shopping experience!", 4, shop);
        shop.addReview(review);

        assertEquals(1, shop.reviews.size());
        assertEquals(review, shop.reviews.get(0));
    }

    @Test
    public void testTheaterConstructorAndToString() {
        Theater theater = new Theater("Cineplex");

        assertEquals("Cineplex", theater.getName());
        assertEquals("Theater{" +
                "name='Cineplex', movies='[]', stars='0'}", theater.toString());
    }

    @Test
    public void testAddTheaterReview() {
        Theater theater = new Theater("Cineplex");
        Review review = new Review("Bob", "Enjoyed the movie experience!", 5, "Avengers: Endgame", theater);
        theater.addReview(review);

        assertEquals(1, theater.reviews.size());
        assertEquals(review, theater.reviews.get(0));
    }
}
