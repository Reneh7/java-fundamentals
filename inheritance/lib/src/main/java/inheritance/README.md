# Restaurant Review System

## Overview

The Restaurant Review System is a Java application that allows users to manage and review restaurants. 
It consists of three main classes: `Restaurant`, `Review`, and `LibraryTest` for testing. 
The architecture follows an object-oriented design, where `Restaurant` and `Review` are the main entities.

### Restaurant Class

The `Restaurant` class represents a restaurant and includes attributes such as name, stars (rating), and price category.
It has methods to add reviews and update its star rating based on the reviews.

### Review Class

The `Review` class represents a review written by a user for a specific restaurant. 
It includes attributes like author, body, number of stars, and the associated restaurant.

### LibraryTest Class

The `LibraryTest` class contains JUnit tests to ensure the correct behavior of the `Restaurant` and `Review` classes.
It tests adding reviews, updating star ratings, and generating appropriate string representations.
