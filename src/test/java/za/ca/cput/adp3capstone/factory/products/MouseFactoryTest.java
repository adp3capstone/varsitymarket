package za.ca.cput.adp3capstone.factory.products;
/* MouseFactoryTest.java
Mouse Factory Test class
Author: Ethan Le Roux (222622172)
Date:17 April 2025
*/
import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Seller;
import za.ca.cput.adp3capstone.domain.products.Mouse;

import static org.junit.jupiter.api.Assertions.*;

class MouseFactoryTest {
    Mouse mouse = MouseFactory.createMouse(
            2001L,
            new Seller(),
            "HyperClick RGB Mouse",
            Category.MOUSE,
            "An ergonomic gaming mouse with adjustable DPI and RGB lighting.",
            "https://example.com/images/mouse1.jpg",
            "HyperTech",
            899.99,
            false,
            "Wireless",
            true,
            16000
    );

    @Test
    void createMouse() {
        assertNotNull(mouse);
        System.out.println(mouse.toString());
    }
}