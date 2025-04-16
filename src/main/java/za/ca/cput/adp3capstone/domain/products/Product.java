package za.ca.cput.adp3capstone.domain.products;

import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Seller;

/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
public abstract class Product {
    protected long productId;
    protected Seller productSeller;
    protected String productName;
    protected Category category;
    protected String description;
    protected String imageUrl;
    protected String brand;
    protected double price;
    protected boolean isSecondHand;

    public long getProductId() {
        return productId;
    }

    public Seller getProductSeller() {
        return productSeller;
    }

    public String getProductName() {
        return productName;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public abstract String toString();
}
