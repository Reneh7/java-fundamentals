/*
 * This Java source file was generated by the Gradle 'init' task.
 */
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

        assertEquals(4, restaurant.getStars());
    }

    @Test
    public void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("Yummy Bites", 3, 1);
        String expected = "Restaurant{name='Yummy Bites', stars=3, price=1}";
        assertEquals(expected, restaurant.toString());
    }
    @Test
    public void testReviewToString() {
        Restaurant restaurant = new Restaurant("Tasty Treats", 4, 2);
        Review review = new Review("Charlie", "Lovely ambiance!", 4, restaurant);

        String expected = "Review{author='Charlie', body='Lovely ambiance!', stars=4, restaurant=Tasty Treats}";
        assertEquals(expected, review.toString());
    }
}
