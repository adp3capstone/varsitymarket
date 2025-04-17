package za.ca.cput.adp3capstone.repository;
/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
import org.junit.jupiter.api.*;
import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Review;
import za.ca.cput.adp3capstone.domain.Seller;
import za.ca.cput.adp3capstone.domain.User;
import za.ca.cput.adp3capstone.domain.products.Product;
import za.ca.cput.adp3capstone.factory.ReviewFactory;
import za.ca.cput.adp3capstone.factory.products.LaptopFactory;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReviewRepositoryTest {
    private static IReviewRepository reviewRepository = ReviewRepository.getRepository();
    private User user = new User();
    private Product laptop = LaptopFactory.createLaptop(
            1001L,
            new Seller(),
            "UltraTech ProBook 15",
            Category.LAPTOP,
            "A powerful laptop for developers and gamers.",
            "https://example.com/images/laptop1.jpg",
            "UltraTech",
            15999.99,
            false,
            "Intel Core i7 11th Gen",
            16,
            512,
            "SSD",
            "NVIDIA GeForce RTX 3060",
            15.6,
            "1920x1080",
            "Windows 11 Pro",
            10.5,
            1.8,
            true,
            "QWERTY",
            3,
            true,
            true,
            false
    );
    private Review review = ReviewFactory.createReview(98901L,user,"This pc works!","I like it. good value for money", LocalDateTime.now(),5,laptop);

    @Test
    @Order(1)
    void create() {
        reviewRepository.create(review);
        assertNotNull(review);
        System.out.println(review);
    }

    @Test
    @Order(2)
    void read() {
        Review review = reviewRepository.read(98901L);
        assertNotNull(review);
        System.out.println(review);
    }

    @Test
    @Order(3)
    void update() {
        Review newReview = new Review.Builder().copy(review).setReviewRating(2)
                .build();
        Review updatedReview = reviewRepository.update(newReview);
        assertNotNull(updatedReview);
        System.out.println(updatedReview.toString());
    }

    @Test
    @Disabled
    @Order(4)
    void delete() {
        assertTrue(reviewRepository.delete(review));
        System.out.println("Successfully deleted product.");
    }

    @Test
    @Order(5)
    void getAll(){
        System.out.println(reviewRepository.getAll());
    }
}