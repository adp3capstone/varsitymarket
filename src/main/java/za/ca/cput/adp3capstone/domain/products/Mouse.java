package za.ca.cput.adp3capstone.domain.products;
/*
 Mouse.java
 Author: Ethan Le Roux (222622172)
 Date: 16 April 2025
 */
import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Seller;

public class Mouse extends Product{
    private String connectivityType; // "Wireless", "Wired",etc
    private boolean hasRGB;
    private int dpi;

    private Mouse(){}

    private Mouse(Builder builder){
        this.productId = builder.productId;
        this.productSeller = builder.productSeller;
        this.productName = builder.productName;
        this.category = builder.category;
        this.description = builder.description;
        this.imageUrl = builder.imageUrl;
        this.brand = builder.brand;
        this.price = builder.price;
        this.isSecondHand = builder.isSecondHand;
        this.connectivityType = builder.connectivityType;
        this.hasRGB = builder.hasRGB;
        this.dpi = builder.dpi;
    }

    public static class Builder{
        private long productId;
        private Seller productSeller;
        private String productName;
        private Category category;
        private String description;
        private String imageUrl;
        private String brand;
        private double price;
        private boolean isSecondHand;
        private String connectivityType;
        private boolean hasRGB;
        private int dpi;

        public Builder setProductId(long productId) {
            this.productId = productId;
            return this;
        }

        public Builder setProductSeller(Seller productSeller) {
            this.productSeller = productSeller;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setCategory(Category category) {
            this.category = category;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setSecondHand(boolean secondHand) {
            isSecondHand = secondHand;
            return this;
        }

        public Builder setConnectivityType(String connectivityType) {
            this.connectivityType = connectivityType;
            return this;
        }

        public Builder setHasRGB(boolean hasRGB) {
            this.hasRGB = hasRGB;
            return this;
        }

        public Builder setDpi(int dpi) {
            this.dpi = dpi;
            return this;
        }

        public Builder copy(Mouse mouse) {
            this.productId = mouse.productId;
            this.productSeller = mouse.productSeller;
            this.productName = mouse.productName;
            this.category = mouse.category;
            this.description = mouse.description;
            this.imageUrl = mouse.imageUrl;
            this.brand = mouse.brand;
            this.price = mouse.price;
            this.isSecondHand = mouse.isSecondHand;
            this.connectivityType = mouse.connectivityType;
            this.hasRGB = mouse.hasRGB;
            this.dpi = mouse.dpi;
            return this;
        }

        public Mouse build() {
            return new Mouse(this);
        }
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "connectivityType='" + connectivityType + '\'' +
                ", hasRGB=" + hasRGB +
                ", dpi=" + dpi +
                ", productId=" + productId +
                ", productSeller=" + productSeller +
                ", productName='" + productName + '\'' +
                ", category=" + category +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", isSecondHand=" + isSecondHand +
                '}';
    }
}
