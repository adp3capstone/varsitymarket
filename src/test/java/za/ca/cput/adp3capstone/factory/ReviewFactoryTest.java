package za.ca.cput.adp3capstone.factory;
/* ReviewFactoryTest.java
Review Factory Test class
Author: Ethan Le Roux (222622172)
Date:17 April 2025
*/
import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Review;
import za.ca.cput.adp3capstone.domain.Seller;
import za.ca.cput.adp3capstone.domain.User;
import za.ca.cput.adp3capstone.domain.products.Product;
import za.ca.cput.adp3capstone.factory.products.LaptopFactory;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ReviewFactoryTest {
    User user = new User();
    Product laptop = LaptopFactory.createLaptop(
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
    Review review = ReviewFactory.createReview(98901L,user,"This pc works!","I like it. good value for money", LocalDateTime.now(),5,laptop);

    @Test
    void createReview() {
        assertNotNull(review);
        System.out.println(review.toString());
    }
}