package za.ca.cput.adp3capstone.factory.products;

import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Seller;
import za.ca.cput.adp3capstone.domain.products.Mouse;

import static za.ca.cput.adp3capstone.util.Helper.*;

public class MouseFactory {
    public static Mouse createMouse(
            long productId,
            Seller productSeller,
            String productName,
            Category category,
            String description,
            String imageUrl,
            String brand,
            double price,
            boolean isSecondHand,
            String connectivityType,
            boolean hasRGB,
            int dpi) {

        if (isIntZero((int) productId)
                || isObjectNull(productSeller)
                || isStringNullOrEmpty(productName)
                || isObjectNull(category)
                || isStringNullOrEmpty(description)
                || isStringNullOrEmpty(imageUrl)
                || isStringNullOrEmpty(brand)
                || isDoubleNull(price)
                || isStringNullOrEmpty(connectivityType)
                || isIntNegative(dpi)) {
            return null;
        }

        return new Mouse.Builder()
                .setProductId(productId)
                .setProductSeller(productSeller)
                .setProductName(productName)
                .setCategory(category)
                .setDescription(description)
                .setImageUrl(imageUrl)
                .setBrand(brand)
                .setPrice(price)
                .setIsSecondHand(isSecondHand)
                .setConnectivityType(connectivityType)
                .setHasRGB(hasRGB)
                .setDpi(dpi)
                .build();
    }
}
