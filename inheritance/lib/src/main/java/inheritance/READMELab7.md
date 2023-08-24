# Restaurant Review System

## Overview

The Restaurant Review System is a Java application designed to facilitate the management and review of various establishments,
including restaurants, theaters, and shops. The system comprises several key classes, including Restaurant, Theater, Shop, Review, 
and LibraryTest for comprehensive testing. The system employs an object-oriented architecture, encapsulating core functionalities within these entities.

### Restaurant Class

The Restaurant class serves as a blueprint for representing individual restaurants.
It encompasses essential attributes such as the restaurant's name, star rating, and price category.
The class offers methods to efficiently add reviews and dynamically update the star rating based on the cumulative feedback received.

## Theater

The Theater class models a theater, providing features to manage its name, movie showings, and associated reviews.
Users can add and remove movies, as well as write and store reviews for the theater.

## Shop

The Shop class represents a retail shop, including attributes like the shop's name, description, and dollar sign rating. 
Similar to other classes, users can leave reviews to share their shopping experiences.

### Review Class

The Review class plays a pivotal role in capturing user-generated reviews for various establishments.
It features attributes such as the author's name, review content, star rating,
and a reference to the associated establishment (restaurant, theater, or shop).
This class supports the comprehensive representation of reviews across different types of establishments.

## CommonMethods

The CommonMethods class serves as a base class for other classes, specifically the Restaurant, Shop, and Theater classes.
This class encapsulates common attributes and behavior that these derived classes share like updateStars(),addReview() and getName().

### LibraryTest Class

The LibraryTest class serves as the backbone of quality assurance, offering JUnit tests that validate the correct functionality of the Restaurant,
Theater, Shop, and Review classes. These tests encompass critical scenarios such as the addition of reviews, the accurate calculation of star ratings,
and the generation of appropriate textual representations for easy comprehension.
